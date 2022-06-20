package Test3;

import org.testng.annotations.Test;

import ApiUtils.API3;

public class DeleteAzure extends API3 {
	@Test
	public void Test3DeleteAzure()
	{
		API3 obj= new API3();
		obj.deleteMethod();
	}

}
