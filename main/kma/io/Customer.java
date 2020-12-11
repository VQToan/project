package main.kma.io;

import java.io.Serializable;


public class Customer implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	private String idCus;
	private String identification;
	private String phone;
	private String dateStart;
	private String dateEnd;
	
	public Customer() {
	}
	public Customer(String fullName, String idCus, String identification, String phone, String dateStart,
			String dateEnd) {
		super();
		this.fullName = fullName;
		this.idCus = idCus;
		this.identification = identification;
		this.phone = phone;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIdCus() {
		return idCus;
	}
	public void setIdCus(String idCus) {
		this.idCus = idCus;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public String getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getLine() {
		String s =idCus.substring(idCus.lastIndexOf("H")+1);
		return  "KH " + s + ": "+
			" Họ tên:: " + fullName + " ,CMND: " + identification + " ,Số điện thoại: " 
			+ phone + " ,Mã khách hàng: " + idCus + 
				" ,Thời gian ở: "+ dateStart +" ,Thời gian đi:: "+dateEnd+"\n";
	}
	
	public String getLine1() {
		String s =idCus.substring(idCus.lastIndexOf("H")+1);
		int j = Integer.parseInt(s);
			return j+"       /"+idCus+"       /"+fullName+"       /"+identification+
				"       /"+phone+"       /"+dateStart+"       /"+dateEnd;
		}
}  
