package pojoclassesforserlizationanddesirlization;

public class Spouse {
String spouseEname;
int phno;
String emailid;
String  address;
public Spouse(String spouseEname, int phno, String emailid, String address) {
	super();
	this.spouseEname = spouseEname;
	this.phno = phno;
	this.emailid = emailid;
	this.address = address;
	
}
public String getSpouseEname() {
	return spouseEname;
}
public int getPhno() {
	return phno;
}
public String getEmailid() {
	return emailid;
}
public String getAddress() {
	return address;
}
public void setSpouseEname(String spouseEname) {
	this.spouseEname = spouseEname;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public void setAddress(String address) {
	this.address = address;
}

}
