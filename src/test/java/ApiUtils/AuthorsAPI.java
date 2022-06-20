package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class AuthorsAPI {
	public void getMethod()
	{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/Authors").then().log().all().assertThat().statusCode(200);
	}
	public void createMethod() throws FileNotFoundException
	{

		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	    .body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\CreateAuthor.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	    .when().log().all().post("/Authors").then().log().all().assertThat().statusCode(200);
	}
	private String getFileContent(String filepath) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file= new File(filepath);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void getMethodBook()
	{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/Authors/authors/books/3").then().log().all().assertThat().statusCode(200);
	}
	public void getMethodSpecific()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/Authors/5").then().log().all().assertThat().statusCode(200);
	}
	public void putMethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
		.body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\PutAuthor.txt"))
		.header("Accept","application/json").header("Content-Type","application/json")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/Authors/4").then().log().all().assertThat().statusCode(200);
	}
    public void deleteMethod()
    {
    	RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
    	.headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").header("Accept","application/json")
    	.when().log().all().delete("/Authors/102").then().log().all().assertThat().statusCode(200);
    }
}
