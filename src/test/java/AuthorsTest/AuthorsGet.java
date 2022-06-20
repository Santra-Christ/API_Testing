package AuthorsTest;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsGet extends AuthorsAPI {
	@Test
	public void TestGetMethod()
	{
		AuthorsAPI obj= new AuthorsAPI();
		obj.getMethod();
	}

}
