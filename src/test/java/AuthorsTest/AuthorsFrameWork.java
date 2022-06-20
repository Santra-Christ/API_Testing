package AuthorsTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.AuthorsAPI;

public class AuthorsFrameWork extends AuthorsAPI {
		@Test(priority=1)
		public void TestGetMethod()
		{
			AuthorsAPI obj= new AuthorsAPI();
			obj.getMethod();
		}
			@Test(priority=2)
			public void TestcreateMethod() throws FileNotFoundException
			{
				AuthorsAPI obj= new AuthorsAPI();
				obj.createMethod();
			}
		@Test(priority=3)
		public void TestGetMethodBook()
		{
			AuthorsAPI obj = new AuthorsAPI();
			obj.getMethodBook();
			
		}
	    @Test(priority=4)
	    public void TestgetMethodSpecific()
	    {
		AuthorsAPI obj =  new AuthorsAPI();
		obj.getMethodSpecific();
	    }
	    @Test(priority=5)
	    public void TestPutMethod() throws FileNotFoundException
		{
			AuthorsAPI obj = new AuthorsAPI();
			obj.putMethod();
		}
	    @Test(priority=6)
	    public void TestDeleteMethod()
		{
			AuthorsAPI obj = new AuthorsAPI();
			obj.deleteMethod();
		}

		}


