package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CreateAPI;

public class VerifyGetMethod extends CreateAPI {
	@Test(priority=1)
	public void Method() {
	CreateAPI ap =new CreateAPI();
	   ap.getMethod();

	}
	@Test(priority=2)
	public void method1()
	{
		CreateAPI ap =new CreateAPI();
		   ap.deleteMethod();
	}
	@Test(enabled=false)
	public void method3() throws FileNotFoundException
	{
		CreateAPI ap =new CreateAPI();
		   ap.CreateMethod();
	}
	}