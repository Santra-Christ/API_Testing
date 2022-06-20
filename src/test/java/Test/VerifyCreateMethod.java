package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;

public class VerifyCreateMethod extends CreateAPI{
	@Test
	public void TestCreateMethod() throws FileNotFoundException{
		CreateAPI obj1=new CreateAPI();
		obj1.CreateMethod();
	}
}
