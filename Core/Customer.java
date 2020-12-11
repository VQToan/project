package Core;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rollNo;
	private String firstName;
	private String fullName;
	private String iD;
	private String iDRoom;
	private InfoTime inOut;
	public Customer() {
		super();
	}
	public Customer(String rollNo, String firstName, String fullName, String iD, String iDRoom, InfoTime inOut) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.fullName = fullName;
		this.iD = iD;
		this.iDRoom = iDRoom;
		this.inOut = inOut;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getiDRoom() {
		return iDRoom;
	}
	public void setiDRoom(String iDRoom) {
		this.iDRoom = iDRoom;
	}
	public InfoTime getInOut() {
		return inOut;
	}
	public void setInOut(InfoTime inOut) {
		this.inOut = inOut;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Customer [rollNo=" + rollNo + ", firstName=" + firstName + ", fullName=" + fullName + ", iD=" + iD
				+ ", iDRoom=" + iDRoom + ", inOut=" + inOut + "]";
	}
	public String getXMLStringofCustomer() {
		return "<Customer>\r\n"
				+ "		<rollNo>"+rollNo+"</rollNo>\r\n"
				+ "		<firstName>"+firstName+"</firstName>\r\n"
				+ "		<fullName>"+fullName+" </fullName>\r\n"
				+ "		<iD>"+iD+"</iD>\r\n"
				+ "		<iDRoom>"+iDRoom+"</iDRoom>\r\n"
				+ "		<inOut>\r\n"
				+ "			<timeIn>"+inOut.getTimeIn()+"</timeIn>\r\n"
				+ "			<dateIn>"+inOut.getdateIn()+"</dateIn>\r\n"
				+ "			<timeOut>"+inOut.getTimeOut()+"</timeOut>\r\n"
				+ "			<dateout>"+inOut.getdateOut()+"</dateout>\r\n"
				+ "		</inOut>\r\n"
				+ "	</Customer>";
	}
	
}
