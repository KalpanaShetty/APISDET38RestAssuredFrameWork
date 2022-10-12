package parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameterTest {
@Test
public void QueryparameterTest() {
	given()
	.queryParam("page", 3)
	.when()
	.get("https://reqres.in/api/users")
	.then().log().all();
	//query parameter we dont have to mention in the uri , 
	//it wil automatically take that
}
}
