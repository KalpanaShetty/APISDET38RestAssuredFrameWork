package crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
@Test
public void updateProjectTest() {
	baseURI="http://localhost";
	port=8084;
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "Kalpana");
	jobj.put("projectName", "Mission-A");
	jobj.put("status", "Created");
	jobj.put("teamSize", 10);
	given()
	      .body(jobj)
	       .contentType(ContentType.JSON)
	.when()
	       .put("/projects/TY_PROJ_1012")
     .then()
            .assertThat()
                      .contentType(ContentType.JSON)
                      .statusCode(200)
                      .log().all();
}
}
