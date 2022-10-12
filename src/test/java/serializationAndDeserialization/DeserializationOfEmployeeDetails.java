package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetails;

public class DeserializationOfEmployeeDetails {
@Test
public void deserialisationEmpdetailsTest() throws Throwable, Throwable, Throwable {
	//step1:- create the objcet for object mapper 
	ObjectMapper obj= new ObjectMapper();
	//step2:-read the value from object mapper
	EmployeeDetails e1 = obj.readValue(new File("./EmployeeDetails.json"),EmployeeDetails.class);
	//fetch the required value from the
	
	System.out.println(e1.geteName());
	e1.getAddress();
	e1.getClass();
	e1.getEmail();
}
}
