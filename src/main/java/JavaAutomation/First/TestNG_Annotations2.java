package JavaAutomation.First;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations2 {

	
	@AfterMethod                                            //Work in one class, Run at end of each testmethod
	public void test5()
	{
		System.out.println("This is test5 function"); 
	}
	@Test
	public void test6()
	{
		System.out.println("This is test6 function"); 
	}
	
	@Test
	public void test7()
	{
		System.out.println("This is test7 function"); 
	}
	@BeforeMethod                                            //Work in one class, Run at start of each testmethod
	public void test8()
	{
		System.out.println("This is test8function"); 
	}
	
	
	
}
