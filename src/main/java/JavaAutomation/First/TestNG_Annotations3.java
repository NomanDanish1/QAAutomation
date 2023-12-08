package JavaAutomation.First;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Annotations3 {
	
	
	@AfterClass                                            //Class k end pe run
	public void test9()
	{
		System.out.println("This is test9 function"); 
	}
	
	@Test
	public void test10()
	{
		System.out.println("This is test10 function"); 
	}

	@Test
	public void test11()
	{
		System.out.println("This is test11 function"); 
	}
	
	@BeforeClass                                           // Class k start pe run
	public void test12()
	{
		System.out.println("This is test12 function"); 
	}

}
