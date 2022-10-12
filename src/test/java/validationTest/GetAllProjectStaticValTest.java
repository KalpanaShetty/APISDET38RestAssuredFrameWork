package validationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class GetAllProjectStaticValTest {
@Test
public void getAllProjectsTest() {
	String expectedPname="Rmgy340";
 Response response = when().get("http://localhost:8084/projects");
 String actualPname = response.jsonPath().get("[0].projectName");
 Assert.assertEquals(actualPname, expectedPname);
}
}
