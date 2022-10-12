package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailswithObject;

public class DeserilaizationOfEmpDataUsingObject {
@Test
public void deserilaizationOfEmpDataUsigObject() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper obj= new ObjectMapper();
	EmployeeDetailswithObject jo =
obj.readValue(new File("EmpDataWithObject.json"), EmployeeDetailswithObject.class);
	 //System.out.println(jo.geteName());
	System.out.println(jo.getSpouse());
	//System.out.println(jo.geteMail()[0]);
}
}
