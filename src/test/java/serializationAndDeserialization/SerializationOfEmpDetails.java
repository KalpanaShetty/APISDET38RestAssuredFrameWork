package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetails;

public class SerializationOfEmpDetails {
@Test
public void serializationEmpDeatilsTest() throws Throwable, Throwable, Throwable {
	//Step1:- create object of pojo class
	EmployeeDetails emp= new EmployeeDetails("Kalpana", "Tycs024", 789456, "ks@gmail.com", "Banglore");
	//Step2:- create objcet for object mapper
	ObjectMapper objm= new ObjectMapper();
	//Step 3 write the value to the json file
	objm.writeValue(new File("./EmployeeDetails.json"), emp);
}
}
