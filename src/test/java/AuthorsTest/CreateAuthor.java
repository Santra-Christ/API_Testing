package AuthorsTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class CreateAuthor extends AuthorsAPI {
	@Test
	public void TestcreateMethod() throws FileNotFoundException
	{
		AuthorsAPI obj= new AuthorsAPI();
		obj.createMethod();
	}

}
