package CoverPhotosTest;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.CoverPhotosAPI;

public class CoverPhotosFramework extends CoverPhotosAPI {
	@Test(priority=1)
	public void TestGetMethod()
	{
		CoverPhotosAPI obj= new CoverPhotosAPI();
		obj.getMethod();
	}
		@Test(priority=2)
		public void TestcreateMethod() throws FileNotFoundException
		{
			CoverPhotosAPI obj= new CoverPhotosAPI();
			obj.createMethod();
		}
	@Test(priority=3)
	public void TestGetMethodBook()
	{
		CoverPhotosAPI obj = new CoverPhotosAPI();
		obj.getMethodBook();
		
	}
    @Test(priority=4)
    public void TestgetMethodSpecific()
    {
    	CoverPhotosAPI obj =  new CoverPhotosAPI();
	obj.getMethodSpecific();
    }
    @Test(priority=5)
    public void TestPutMethod() throws FileNotFoundException
	{
    	CoverPhotosAPI obj = new CoverPhotosAPI();
		obj.putMethod();
	}
    @Test(priority=6)
    public void TestDeleteMethod()
	{
    	CoverPhotosAPI obj = new CoverPhotosAPI();
		obj.deleteMethod();
	}


}
