package pojoclassesforserlizationanddesirlization;

import java.util.Objects;

public class Employeedetail {
	String Ename;
	String Eid;
	String EmailId;
	int Phno;
	String Address;
	Object Spouse;
	
		

	public Employeedetail(String ename, String eid, String emailId, int phno, String address, Object spouse) {
		super();
		Ename = ename;
		Eid = eid;
		EmailId = emailId;
		Phno = phno;
		Address = address;
		Spouse = spouse;
	}
	public Employeedetail() {
		// TODO Auto-generated constructor stub
	}
	public String getEname() {
		return Ename;
	}
	public String getEid() {
		return Eid;
	}
	public String getEmailId() {
		return EmailId;
	}
	public int getPhno() {
		return Phno;
	}
	public String getAddress() {
		return Address;
	}
	public Object getSpouse() {
		return Spouse;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public void setEid(String eid) {
		Eid = eid;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public void setPhno(int phno) {
		Phno = phno;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setSpounce(Object spouse) {
		Spouse = spouse;
	}
	
}
