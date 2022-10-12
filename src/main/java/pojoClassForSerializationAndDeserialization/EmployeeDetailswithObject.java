package pojoClassForSerializationAndDeserialization;

public class EmployeeDetailswithObject {
//declare variables globally
	String eName;
	String eId;
	int[] pNo;
	String[] eMail;
	Object Spouse;
	
	public EmployeeDetailswithObject(String eName, String eId, int[] pNo, String[] eMail, Object spouse) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.pNo = pNo;
		this.eMail = eMail;
		Spouse = spouse;
	}
	
	public EmployeeDetailswithObject() {
		
	}

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

	public int[] getpNo() {
		return pNo;
	}

	public void setpNo(int[] pNo) {
		this.pNo = pNo;
	}

	public String[] geteMail() {
		return eMail;
	}

	public void seteMail(String[] eMail) {
		this.eMail = eMail;
	}

	public Object getSpouse() {
		return Spouse;
	}

	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	
}
