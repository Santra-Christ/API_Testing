package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class CreateAPI {
	public void getMethod()
	{
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().get("/booking/45").then().log().all().assertThat().statusCode(200);
	}
	public void deleteMethod()
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	      .headers("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/booking/349").then().log().all().assertThat().statusCode(201);
	}
	public void CreateMethod() throws FileNotFoundException 
	{
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	    .body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\CreateOnly.txt"))
	    .header("Accept","application/json").header("Content-Type","application/json")
	    .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	    .when().log().all().post("/booking").then().log().all().assertThat().statusCode(200);
		}
	@SuppressWarnings("resource")
	public static String getFileContent(String filepath) throws FileNotFoundException{
		File file = new File(filepath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

	}
