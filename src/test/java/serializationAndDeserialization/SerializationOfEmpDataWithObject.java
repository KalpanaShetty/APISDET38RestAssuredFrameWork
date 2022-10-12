package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDetailswithObject;
import pojoClassForSerializationAndDeserialization.Spouse;

public class SerializationOfEmpDataWithObject {
@Test
public void serializationOfEmpDataWithObjectTest() throws Throwable, JsonMappingException, IOException {
	//step:create the object for pojo class
	int[] phno= {123654,987456};
	String[] email= {"ks@gamil.com","ns@gmail.com"};
	Spouse sp= new Spouse("xys", 951236, "xyz@gamil.com");
	EmployeeDetailswithObject empo=new EmployeeDetailswithObject("Ks", "tysc024", phno, email, sp);
	//step2:- create the object for object mapper
	ObjectMapper obm= new ObjectMapper();
	
	
	//step3:- write the data to json file
	obm.writeValue(new File("./EmpDataWithObject.json"), empo);
}
}
