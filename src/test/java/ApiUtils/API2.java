package ApiUtils;

import io.restassured.RestAssured;

public class API2 {
	public void getMethod() {
		 RestAssured.given().baseUri("https://reqres.in/api").when().log().all().get("/users/2").then().log().all();
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://reqres.in").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=","Accept","application/json").when().log().all().delete("/api/users/6").then().log().all().assertThat().statusCode(204);
	}

}
