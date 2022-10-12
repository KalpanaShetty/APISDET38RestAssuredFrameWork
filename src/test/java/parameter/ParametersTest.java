package parameter;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class ParametersTest {
	
	@Test
	public void parameter(){
		given()
		
			.pathParam("username", "KalpanaShetty")
			.queryParam("sort", "full_name")
			.queryParam("page", "1")
			
		.when()
				.get("https://api.github.com/users/{username}/repos")
		.then()
		   		.assertThat().statusCode(200).log().all();
	}

}
