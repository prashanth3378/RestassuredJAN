package pojoclassesforserlizationanddesirlization;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Employedetail1 {
	String Ename;
	String Eid;
	String[] EmailId;
	int[] Phno;
	String Address;
	public Employedetail1(String ename, String eid, String[] emailId, int[] phno, String address) {
		super();
		Ename = ename;
		Eid = eid;
		EmailId = emailId;
		Phno = phno;
		Address = address;
	}
		Employedetail1()
		{
			
		}
	public String getEname() {
		return Ename;
	}
	public String getEid() {
		return Eid;
	}
	public String[] getEmailId() {
		return EmailId;
	}
	public int[] getPhno() {
		return Phno;
	}
	public String getAddress() {
		return Address;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public void setEid(String eid) {
		Eid = eid;
	}
	public void setEmailId(String[] emailId) {
		EmailId = emailId;
	}
	public void setPhno(int[] phno) {
		Phno = phno;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
