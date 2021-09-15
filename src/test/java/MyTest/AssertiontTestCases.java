package MyTest;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class AssertiontTestCases {

	SoftAssert softassert=new SoftAssert();
	
	
	@Test
	public void test1()
	{
		System.out.println("open browser");
		softassert.assertEquals(true,false);//soft assertion
		
		System.out.println("go to contact tab");
		softassert.assertEquals(true,false);
		
		System.out.println("go to new1 tab");
		softassert.assertEquals(true,false);
		
		System.out.println("go to new2 tab");
		softassert.assertEquals(true,false);
		
		System.out.println("go to deals tab");
		//Assert.assertEquals(true, false);  //it is hard assertion
		
		System.out.println("go to shopping tab");
		
		softassert.assertAll(); //it will marked all soft assert test cases as fail if they failed inexecution
	}
}
