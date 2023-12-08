package JavaAutomation.First;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@AfterTest                                        //Run after all tests in suite but before AfterSuite
	public void test1()
	{
		System.out.println("This is test1 function"); 
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is test2 function"); 
	}

	@Test
	public void test3()
	{
		System.out.println("This is test3 function"); 
	}
	
	@BeforeTest                                            // Run before all tests in suit but after BeforeSuit
	public void test4()
	{
		System.out.println("This is test4 function"); 
	}
}
