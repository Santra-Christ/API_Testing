package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGAnno {
	@BeforeMethod
	public void openURL()
	{
		System.out.println("URL should open");
	}
	@AfterMethod
	public void closingBrowser()
	{
		System.out.println("Closing Browser");
	}

}
