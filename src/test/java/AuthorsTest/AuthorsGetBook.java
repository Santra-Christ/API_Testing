package AuthorsTest;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsGetBook extends AuthorsAPI {
	@Test
	public void TestGetMethodBook()
	{
		AuthorsAPI obj = new AuthorsAPI();
		obj.getMethodBook();
		
	}

}
