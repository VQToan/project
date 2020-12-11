package Core;

import java.io.Serializable;

public class Room implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String iDsRoom;
	private Boolean status;
	private int beds; // sá»‘ giÆ°á»�ng (1- Ä‘Æ¡n , 2- Ä‘Ã´i, 11- 2 láº»)
	private String typeRoom; // (option : N - normal, V - vip)
	private int price;
	public Room() {
		super();
	}
	public Room(String iDsRoom, Boolean status, int beds, String typeRoom, int price) {
		super();
		this.iDsRoom = iDsRoom;
		this.status = status;
		this.beds = beds;
		this.typeRoom = typeRoom;
		this.price = price;
	}
	public String getiDsRoom() {
		return iDsRoom;
	}
	public void setiDsRoom(String iDsRoom) {
		this.iDsRoom = iDsRoom;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public String getTypeRoom() {
		return typeRoom;
	}
	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Room [iDsRoom=" + iDsRoom + ", status=" + status + ", beds=" + beds + ", typeRoom=" + typeRoom
				+ ", price=" + price + "]";
	}
	public String getXMLStringofRoom() {
		return "	<Room>\r\n"
				+ "		<iDsRoom>"+iDsRoom+"</iDsRoom>\r\n"
				+ "		<status>"+String.valueOf(status)+"</status>\r\n"
				+ "		<beds>"+String.valueOf(beds)+"</beds>\r\n"
				+ "		<typeRoom>"+typeRoom+"</typeRoom>\r\n"
				+ "		<price>"+String.valueOf(price)+"</price>\r\n"
				+ "	</Room>";
	}
}
