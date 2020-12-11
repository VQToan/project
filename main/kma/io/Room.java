package main.kma.io;

import java.io.Serializable;

public class Room implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String typeRoom;
	private String status;
	private String price;
	private String bed;
	public Room() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeRoom() {
		return typeRoom;
	}
	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public Room(String id, String typeRoom, String status, String price, String bed) {
		super();
		this.id = id;
		this.typeRoom = typeRoom;
		this.status = status;
		this.price = price;
		this.bed = bed;
	}

	public String getline() {
		return "       /"+id+"\n";
	}


	
}
