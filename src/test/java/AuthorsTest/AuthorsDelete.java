package AuthorsTest;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsDelete extends AuthorsAPI{
	@Test
	public void TestDeleteMethod()
	{
		AuthorsAPI obj = new AuthorsAPI();
		obj.deleteMethod();
	}


}
