package Test2;

import org.testng.annotations.Test;

import ApiUtils.API2;

public class DeleteReqres extends API2 {
	@Test
	public void Test2DeleteReqres()
	{
		API2 obj= new API2();
		obj.deleteMethod();
	}

}
