package pojoClassForSerializationAndDeserialization;

public class EmployeeDataWithArray {
	//Declare the variables globally
   String eName;
   String eId;
   int[] phoneNo;
   String eMail;
   String address;
 //create contrctor for initalization
public EmployeeDataWithArray(String eName, String eId, int[] phoneNo, String eMail, String address) {
	super();
	this.eName = eName;
	this.eId = eId;
	this.phoneNo = phoneNo;
	this.eMail = eMail;
	this.address = address;

}
  //create constructor for serialization
public  EmployeeDataWithArray() {
	
}
//create getters and setters for access
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String geteId() {
	return eId;
}
public void seteId(String eId) {
	this.eId = eId;
}
public int[] getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(int[] phoneNo) {
	this.phoneNo = phoneNo;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

   
   
   


}
