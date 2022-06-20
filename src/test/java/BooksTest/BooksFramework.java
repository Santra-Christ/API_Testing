package BooksTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;
import ApiUtils.BooksAPI;

public class BooksFramework extends BooksAPI
{
	@Test(priority=1)
	public void TestGetMethod()
	{
		BooksAPI obj= new BooksAPI();
		obj.getMethod();
	}
		@Test(priority=2)
		public void TestcreateMethod() throws FileNotFoundException
		{
			BooksAPI obj= new BooksAPI();
			obj.createMethod();
		}
	
    @Test(priority=3)
    public void TestgetMethodSpecific()
    {
    	BooksAPI obj =  new BooksAPI();
	obj.getMethodSpecific();
    }
    @Test(priority=4)
    public void TestPutMethod() throws FileNotFoundException
	{
		BooksAPI obj = new BooksAPI();
		obj.putMethod();
	}
    @Test(priority=5)
    public void TestDeleteMethod()
	{
    	BooksAPI obj = new BooksAPI();
		obj.deleteMethod();
	}


}
