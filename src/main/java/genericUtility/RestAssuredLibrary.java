package genericUtility;

import io.restassured.response.Response;

/**
 * Consist of methods of Rest assured tool
 * @author Kalpana Shetty
 *
 */
public class RestAssuredLibrary {

	/**
	 * This method will return json data from the corresponding response body
	 * @author Kalpana Shetty	
	 * @param response
	 * @param path
	 * @return
	 */
	    public String getJsonData(Response response,String path) {
	   String jsonData = response.jsonPath().get(path);
	    return jsonData;
	}



}
	

