package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDataWithArray;

public class DeserializationOfEmpdetailsWithArray {
@Test
public void deserilaiztionOfEmpDataWithArrayTest() throws Throwable, Throwable, Throwable {
	ObjectMapper obj = new ObjectMapper();
	EmployeeDataWithArray Jo = 
			obj.readValue(new File("./EmpDataWithArray.json"), EmployeeDataWithArray.class);
	System.out.println(Jo.getAddress());
	System.out.println(Jo.getClass());
	 System.out.println(Jo.geteName());
	System.out.println(Jo.geteMail());
	 System.out.println(Jo.getPhoneNo()[1]);
	 System.out.println(Jo.getPhoneNo()[0]);
}
}
