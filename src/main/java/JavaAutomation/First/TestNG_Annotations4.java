package JavaAutomation.First;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Annotations4 {
	
	@AfterSuite                                            // suite  k end pe run hoga
	public void test13()
	{
		System.out.println("Suite k bad run"); 
	}
	
	@Test
	public void test14()
	{
		System.out.println("This is test14 function"); 
	}

	@Test
	public void test15()
	{
		System.out.println("This is test15 function"); 
	}
	
	@BeforeSuite                                          //Suite k start main run hoga
	public void test16()
	{
		System.out.println("Suite se pehly Run"); 
	}

}
