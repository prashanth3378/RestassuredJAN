package CrudOPerationWithoutBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

public class restassredgit {

	public void Createproject()
	{
	JSONObject jsobject = new JSONObject();
	jsobject.put("createdby", "prashanth");
	jsobject.put("createdon", "feb");
	jsobject.put("projectName", "AAAAA");
	jsobject.put("status", "ongoing");

	given()
	.contentType(ContentType.JSON)
	.body(jsobject.toJSONString())
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.log().all()
	.assertThat().statusCode(201);

		
	}

}
