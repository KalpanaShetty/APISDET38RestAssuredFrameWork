package crudOperationWithBDD;

import org.testng.annotations.Test;

import genericUtility.BaseClassWithReqSpec;
import static io.restassured.RestAssured.*;

public class SampleTest extends BaseClassWithReqSpec{
	@Test
	public void getallprojectTest() {
		
		given().spec(requestSpec)
		.when()
		.get("/projects")
		             .then().spec(responseSpec);
		
	}
}
