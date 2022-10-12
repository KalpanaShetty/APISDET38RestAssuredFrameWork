package requestChaining;

import org.testng.annotations.Test;



import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClass.genericUtility.AddProjectPOJOTest;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PostAndGetProjectTest {
@Test
public void postAndGet(){
	Random random = new Random();
	int randomNum =  random.nextInt(1000);
	AddProjectPOJOTest obj= new AddProjectPOJOTest("KalpanaShetty", "RmgyantraTyss"+randomNum, "created", 5);

Response response = given().contentType(ContentType.JSON).body(obj).when().post("http://localhost:8084/addProject");
    	String projId = response.jsonPath().get("projectId");
      
    given()
	        .pathParam("ProjectID", projId)
    .when()
        	.get("http://localhost:8084/projects/{ProjectID}")
    .then()
	.assertThat().statusCode(200).log().all();

}
}
