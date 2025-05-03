import org.apache.http.auth.AUTH;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class zoomsmartinterview {
@Test
	public void createpost()
	{
		File fi=new File("./create.json");
		
		baseURI="https:www.zopsmart.com";
		given()
		.auth().basic("username", "password")
		.body(fi).contentType(ContentType.JSON)
		.when().post("/profile/create")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		

	}
}
