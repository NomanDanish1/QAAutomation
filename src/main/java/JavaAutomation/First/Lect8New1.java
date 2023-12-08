package JavaAutomation.First;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lect8New1 {
  @Test
	public void test()
	
	{
		System.out.println("First Test case");
		
	
	}
  @Test
   public void test1()
	
	{
		System.out.println("Second Test case");
		
	}
   @Test
  
   public void test2()

    {
	   
	    System.out.println(" Group_Third Test case");
	
    }
   @Test
   @Parameters({"url"})
   public void test3(String URL)

    {
	   
	    System.out.println("Fourth Test case");
	    System.out.println(URL);
	
    }

}
