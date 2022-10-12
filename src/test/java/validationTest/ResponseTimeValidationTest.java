package validationTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ResponseTimeValidationTest {
@Test
public void ValRespTime() {
	baseURI="http://localhost";
	port=8084;
	when().get("projects")
	.then()
	//.assertThat().contentType(Matchers.conte)
	.assertThat().time(Matchers.lessThan(2000L), TimeUnit.MILLISECONDS);
	//.assertThat().body("[0].projectName", Matchers.equalTo("Rmgy340"));
}
}
