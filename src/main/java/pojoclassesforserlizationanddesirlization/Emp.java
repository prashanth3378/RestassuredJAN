package pojoclassesforserlizationanddesirlization;

public class Emp {
	String Ename;
	String Eid;
	String EmailId;
	int Phno;
	public Emp(String ename, String eid, String emailId, int phno) {
		super();
		Ename = ename;
		Eid = eid;
		EmailId = emailId;
		Phno = phno;
	}
		public Emp()
		{
			
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
	
}
