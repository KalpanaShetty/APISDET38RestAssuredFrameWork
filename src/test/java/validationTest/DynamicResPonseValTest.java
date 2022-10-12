package validationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResPonseValTest {
@Test
public void getAllProjectsTEst() {
	baseURI="http://localhost";
	port=8084;
	String expectpId="TY_PROJ_1628";
	 Response res = when().get("projects");
	 List<String> actulPid = res.jsonPath().get("projectId");
	 Boolean flag= false;
	 for (String aID : actulPid) {
		 if(aID.equalsIgnoreCase(expectpId)) {
			 System.out.println("project id is found");
			 flag=true;
		 }
		
	}
	 Assert.assertTrue(flag);
}
}
