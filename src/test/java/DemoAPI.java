import io.restassured.RestAssured;

public class DemoAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/booking/658").then().log().all().assertThat().statusCode(201);
	}

}
