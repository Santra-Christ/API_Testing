import io.restassured.RestAssured;
public class Reqres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RestAssured.given().baseUri("https://reqres.in/api").when().log().all().get("/users/2").then().log().all();
	}

}
