package reqres;

import io.restassured.RestAssured;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").when().log().all().get("/Activities/3").then().log().all();
	}

}
