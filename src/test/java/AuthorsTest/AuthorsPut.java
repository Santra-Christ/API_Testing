package AuthorsTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsPut extends AuthorsAPI {
	@Test
	public void TestPutMethod() throws FileNotFoundException
	{
		AuthorsAPI obj = new AuthorsAPI();
		obj.putMethod();
	}

}
