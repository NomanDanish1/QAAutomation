package JavaAutomation.First;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lect8New2 {
	@Test
public void group1()
	
	{
		System.out.println("New2 class has group1 implemetation");
		
	
	}
	@Test
	@Parameters({"url"})
public void group2(String URL)

{
	System.out.println("New2 class does not group1 implemetation");
	System.out.println(URL);
	

}

}
