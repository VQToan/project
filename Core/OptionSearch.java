package Core;

import java.util.ArrayList;
/*
 * Lưu ý về dữ liệu vào phải là String
 * 
 * giá trị mặc định của biến vào phải là chuỗi "None"
 * TimeIn và TimeOut dùng hệ 24h để thuận lợi cho tìm kiếm
 * 
 * */
public class OptionSearch {
//	ArrayList<Customer> dataCustomers;
//	String rollNo;
//	String firstName;
//	String fullName;
//	String iD;
//	String iDRom;
//	String dateIn;
//	String dateOut;
//	String timeIn;
//	String timeOut;
//	ArrayList<Room> dataRooms;
//	String iDRoom, status, beds, typeRoom, prices;
//	
//	public OptionSearch(ArrayList<Customer> dataCustomers, String rollNo, String firstName, String fullName, String iD,
//			String iDRom, String dateIn, String dateOut, String timeIn, String timeOut) {
//		super();
//		this.dataCustomers = dataCustomers;
//		this.rollNo = rollNo;
//		this.firstName = firstName;
//		this.fullName = fullName;
//		this.iD = iD;
//		this.iDRom = iDRom;
//		this.dateIn = dateIn;
//		this.dateOut = dateOut;
//		this.timeIn = timeIn;
//		this.timeOut = timeOut;
//	}
	//================ TIM THEO THONG TIN KHAC HANG======================//
	public boolean check1(Customer data, String method, String key) {
		if (key== "None") return true; 
		else {
			if (method=="rollNo" && key==data.getRollNo()) return true;
			if (method=="firstName" && key==data.getFirstName()) return true;
			if (method=="fullName" && key==data.getFullName()) return true;
			if (method=="iD" && key==data.getiD()) return true;
			if (method=="iDRoom" && key==data.getiDRoom()) return true;
			if (method=="dateIn" && key==data.getInOut().getdateIn()) return true;
			if (method=="dateOut" && key==data.getInOut().getdateOut()) return true;
			if (method=="timeIn" && key==data.getInOut().getTimeIn()) return true;
			if (method=="timeOut" && key==data.getInOut().getTimeOut()) return true;
			return false;
		}
	}
	public ArrayList<Customer> searchCustomers(ArrayList<Customer> dataCustomers, String rollNo, String firstName, String fullName, String iD, String iDRom, String dateIn,String dateOut, String timeIn, String timeOut) {
		ArrayList<Customer> endSearchArrayList1 = new ArrayList<>();
		for (Customer customer : dataCustomers) {
			if(		check1(customer,"rollNo", rollNo)
				&&	check1(customer,"firstName", firstName)
				&&	check1(customer,"fullName", fullName)
				&&	check1(customer,"iD", iD)
				&&	check1(customer,"iDRoom", iDRom)
				&&	check1(customer,"dateIn", dateIn)
				&&	check1(customer,"dateOut", dateOut)
				&&	check1(customer,"timeIn", timeIn)
				&&	check1(customer,"timeOut", timeOut)
					) {
				endSearchArrayList1.add(customer);
			}
		}
		return endSearchArrayList1;
	}
	//==========TIM THEO THONG TIN PHONG==================================//
	/*status= ["true","false"]
	 * 
	 * 
	 * */
	
	public boolean check(Room data, String method, String key) {
		if (key=="None") return true;
		else {
			if (method== "iDsRoom" && data.getiDsRoom()==key ) return true;
			if (method== "status" && String.valueOf(data.getStatus())==key) return true;
			if (method== "beds" && String.valueOf(data.getBeds())==key) return true;
			if(method== "typeRoom" && data.getTypeRoom()==key) return true;
			if (method=="price" && String.valueOf(data.getPrice())==key) return true;
			return false;
			}
	}
	
	public ArrayList<Room> SearchRoom(ArrayList<Room> dataRooms, String iDRoom, String status, String beds, String typeRoom, String prices){
		ArrayList<Room> endSearchArrayList = new ArrayList<>();
		for (Room room : dataRooms) {
			if (check(room, "iDsRoom", iDRoom)
				&& check(room, "status", status)
				&& check(room, "beds", beds)
				&& check(room, "typeRoom", typeRoom)
				&& check(room, "price", prices)) {
				endSearchArrayList.add(room);
			}
		}
		return endSearchArrayList;	
	}
}
