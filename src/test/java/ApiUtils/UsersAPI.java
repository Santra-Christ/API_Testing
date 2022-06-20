package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class UsersAPI {
	public void getMethod()
	{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/Users").then().log().all().assertThat().statusCode(200);
	}
	public void createMethod() throws FileNotFoundException
	{

		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	    .body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\CreateUsers.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	    .when().log().all().post("/Users").then().log().all().assertThat().statusCode(200);
	}
	private String getFileContent(String filepath) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file= new File(filepath);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void getMethodSpecific()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/Users/4").then().log().all().assertThat().statusCode(200);
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
		.body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\PutUsers.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/Users/2").then().log().all().assertThat().statusCode(200);
	}
    public void deleteMethod()
    {
    	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
    	.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
    	.when().log().all().delete("/Users/5").then().log().all().assertThat().statusCode(200);
    }

}
