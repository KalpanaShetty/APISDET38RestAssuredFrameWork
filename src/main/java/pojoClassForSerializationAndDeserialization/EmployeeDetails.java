package pojoClassForSerializationAndDeserialization;

public class EmployeeDetails {
//Step1:- Declare the variable globally
	String eName;
	String eId;
	int phoneNo;
	String email;
	String address;
	//create the constructor for initialization
	public EmployeeDetails(String eName, String eId, int phoneNo, String email, String address) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	
	
	//triggering execution during serialization or deserialization
	public EmployeeDetails() {
		
	}
	//setter and getter for access


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


	public int getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
