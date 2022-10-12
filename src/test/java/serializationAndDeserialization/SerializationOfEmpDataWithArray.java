package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerializationAndDeserialization.EmployeeDataWithArray;

public class SerializationOfEmpDataWithArray {
@Test
public void serializationOfEmpdatawitharrayTest() throws Throwable, Throwable, Throwable {
	//create the object for pojo class
	int[] phone= {123456,198745};
	
	EmployeeDataWithArray empa= new EmployeeDataWithArray("Kalpana", "Tycs024", phone, "ks@gmail.com", "banglore");
	//create the object for object mapper
	ObjectMapper objm= new ObjectMapper();
	//write the value to json file
	objm.writeValue(new File("./empDataWithArray.json"), empa);
}
}
