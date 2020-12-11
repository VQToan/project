package Core;

import java.io.IOException;
import java.util.ArrayList;


public class MainRun {
	public static void main(String[] args) throws IOException{
		ArrayList<Room> a = new ArrayList<>();
		ArrayList<Room> b = new ArrayList<Room>();
		b.add(new Room("002", true, 2, "2", 524000));
		b.add(new Room("003", false, 1, "3", 84864132));
		b.add(new Room("004", true, 2, "1", 525424000));
		for (Room room : a) {
			System.out.println(room.toString());
		}
	}
}

