package validationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class StatuslineValidationTest {
@Test
public void statusLineValTest() {
	baseURI="http://localhost";
	port=8084;
	String expectStausLine="HTTP/1.1 200 ";
	 Response res = given().get("projects");
	 
	 	String actualStatusLine = res.getStatusLine();
	 	Assert.assertEquals(actualStatusLine, expectStausLine);
	
}
}
