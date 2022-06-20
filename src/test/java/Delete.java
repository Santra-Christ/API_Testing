import io.restassured.RestAssured;
public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RestAssured.given().baseUri("https://reqres.in").headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=","Accept","application/json").when().log().all().delete("/api/users/3").then().log().all().assertThat().statusCode(204);
	}

}
