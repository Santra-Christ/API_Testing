package ApiUtils;

import io.restassured.RestAssured;

public class API3 {
	public void getMethod() {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().get("/Activities/3").then().log().all().assertThat().statusCode(200);
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().delete("/Activities/5").then().log().all().assertThat().statusCode(200);
	}

}
