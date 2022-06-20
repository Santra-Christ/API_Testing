package AuthorsTest;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsGetSpeci extends AuthorsAPI {
	@Test
	public void TestgetMethodSpecific()
	{
		AuthorsAPI obj =  new AuthorsAPI();
		obj.getMethodSpecific();
	}

}
