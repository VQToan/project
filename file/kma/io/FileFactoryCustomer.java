package file.kma.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import main.kma.io.Customer;

public class FileFactoryCustomer {
	File f = new File("KHACHHANG.DAT");
	public void ghiKH(ArrayList<Customer> list) {
		try {
			if(!f.exists())
				f.createNewFile();
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(list);
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	public ArrayList<Customer> docKH() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		if(!f.exists()) 
			return new ArrayList<Customer>();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			return (ArrayList<Customer>)ois.readObject();
		
	}
}
