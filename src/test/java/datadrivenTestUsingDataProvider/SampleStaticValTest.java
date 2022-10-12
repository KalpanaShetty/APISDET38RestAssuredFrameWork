package datadrivenTestUsingDataProvider;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.util.List;

public class SampleStaticValTest {
@Test
public void staticvalTest() {
	String expectProjName="TY_PROJ_1014";
	Response response =when().get("http://localhost:8084/projects");
	//String actpnmae = response.jsonPath().get("[0].projectName");
	//Assert.assertEquals(expectProjName, actpnmae);
	List<String> pid = response.jsonPath().get("projectId");
	boolean flag= false;
	for (String actualPid : pid) {
		if(actualPid.equalsIgnoreCase(expectProjName)) {
			System.out.println("project id found");
			flag=true;
		}
		
	}
	Assert.assertTrue(flag);
}
}
