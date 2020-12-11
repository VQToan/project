package main.kma.io;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		ArrayList<Room> dsRoom = new ArrayList<Room>();
		ArrayList<Customer> dsCus=new ArrayList<Customer>();
		Room room1 =new Room("012", "Bình dân", "Trống", "60000", "1");
		Room room2=new Room("013", "Bình dân", "Trống", "60000", "1");
		Room room3 =new Room("014", "Bình dân", "Trống", "60000", "1");
		Room room4 =new Room("015", "Bình dân", "Trống", "60000", "1");
		Room room5 =new Room("016", "Bình dân", "Trống", "60000", "1");
		Room room6 =new Room("017", "Bình dân", "Trống",700000, 2);
		Room room7 =new Room("018", "Bình dân", "Trống", 00000, 2);
		Room room9 =new Room("020", "Bình dân", "Trống", 70000, 2);
		Room room10 =new Room("021", "Bình dân", "Trống", 70000, 2);
		Room room11 =new Room("022", "Bình dân", "Trống", 70000, 2);
		Room room12 =new Room("023", "Bình dân", "Trống", 70000, 2);
		Room room13 =new Room("024", "Bình dân", "Trống", 70000, 2);
		Room room14 =new Room("025", "Cao cấp", "Trống", 90000, 1);
		Room room15 =new Room("026", "Cao cấp", "Trống", 90000, 1);
		Room room16 =new Room("027", "Cao cấp", "Trống", 100000, 2);
		Room room17 =new Room("028", "Cao cấp", "Trống", 100000, 2);
		Room room18 =new Room("029", "Cao cấp", "Trống", 100000, 2);
		Room room19 =new Room("030", "Cao cấp", "Trống", 100000, 2);
		Room room20 =new Room("031", "Cao cấp", "Trống", 100000, 2);
		Room room21 =new Room("000", "KING", "Trống", 120000, 1);
		dsRoom.add(room1); dsRoom.add(room2); dsRoom.add(room3);
		dsRoom.add(room4); dsRoom.add(room5); dsRoom.add(room6);
		dsRoom.add(room7); dsRoom.add(room9); dsRoom.add(room10);
		dsRoom.add(room11); dsRoom.add(room12); dsRoom.add(room13);
		dsRoom.add(room14); dsRoom.add(room15); dsRoom.add(room16);
		dsRoom.add(room17); dsRoom.add(room18); dsRoom.add(room19);
		dsRoom.add(room20); dsRoom.add(room21); 
		for(Room room:dsRoom) {
			System.out.println(room);
		}
		
		
	}
}
