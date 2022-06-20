package UsersTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.UsersAPI;

public class UsersFrameWork extends UsersAPI {
	@Test(priority=1)
	public void TestGetMethod()
	{
		UsersAPI obj= new UsersAPI();
		obj.getMethod();
	}
		@Test(priority=2)
		public void TestcreateMethod() throws FileNotFoundException
		{
			UsersAPI obj= new UsersAPI();
			obj.createMethod();
		}
	
    @Test(priority=3)
    public void TestgetMethodSpecific()
    {
    	UsersAPI obj =  new UsersAPI();
	obj.getMethodSpecific();
    }
    @Test(priority=4)
    public void TestPutMethod() throws FileNotFoundException
	{
    	UsersAPI obj = new UsersAPI();
		obj.putMethod();
	}
    @Test(priority=5)
    public void TestDeleteMethod()
	{
    	UsersAPI obj = new UsersAPI();
		obj.deleteMethod();
	}


}
