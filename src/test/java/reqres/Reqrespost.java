package reqres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Reqrespost {

	public static void main(String[] args)  throws FileNotFoundException {
		// TODO Auto-generated method stub
    RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
    .body(getFileContent("C:\\santra\\api testing\\API\\src\\test\\resources\\Create.txt"))
    .header("Content-Type","application/json").when().log().all().post("/Activities").then().log().all().assertThat().statusCode(200);
	}
	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(file);
	    sc.useDelimiter("\\Z");
	    return sc.next();
	}

}
