package CrudOPerationWithoutBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
@Test
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