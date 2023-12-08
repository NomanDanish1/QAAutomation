package JavaAutomation.First;

import java.util.Scanner;



public class FirstTest {

	public static  void main(String[] args)  {
		
		
		System.out.println("Enter your Choice");
		
		Scanner myobj = new Scanner (System.in);
		int name = myobj.nextInt();
	
		
		
		
		
		
//swap number program	
	 if (name==1)
	 {
	    	int x = 25000, y=45000;
			int z;
			
		    z=x;
		    x=y;
		    y=z;
	    System.out.println(x);
	    System.out.println(y);
	   
	 }
	 
	 
//Concatenate strings
	    
	 else if(name == 2){
	    
	    	String Fname = "Noman";
		    String Lname = "Danish";
		    String FullName;
		    
		    FullName = Fname + Lname;
	    System.out.println(FullName);
	    }
	 
	 
	 
// Check Palindrome
	 else if(name == 3){
		    
		 String str, rev = "";
		 System.out.println("Enter a Word");
			
			Scanner sc = new Scanner (System.in);
		     str = sc.nextLine();
		     int length = str.length();
		     
		     
		     for ( int i = length-1 ; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		     
		     if (str.equals(rev))
		         System.out.println(str+" is a palindrome");
		      else
		         System.out.println(str+" is not a palindrome");
		
	    }
	 
// Even odd check program
	 else if(name == 4){
		    
		 int number;
		 System.out.println("Enter any Number");
			
			Scanner sc = new Scanner (System.in);
		     number= sc.nextInt();
		    
		     
		     if (number%2 == 0)
		         System.out.println(number+" is a Even");
		      else
		         System.out.println(number+" is a Odd");
		
	    }
	 
	 
// Reverse a string	 
	 else if(name == 5){
		    
		 String str1, rev1 = "";
		 System.out.println("Enter a Word");
			
			Scanner sc1 = new Scanner (System.in);
		     str1 = sc1.nextLine();
		     int length = str1.length();
		     
		     
		     for ( int i = length-1 ; i >= 0; i-- )
		         rev1 = rev1 + str1.charAt(i);
		     
		     
		       System.out.println(rev1);
		     
		
	    }
	//Table of 9
	 else if(name == 6){
		    
		 System.out.println("Table of 9");
		   
		     
		     for ( int i = 1; i <= 10; i++ ) {
		     System.out.println("9" + "*"+ i + "=" + (i*9));
		     }
	    }
	 
	 
	 else
	 {
		
			 System.out.println("Bhaaaaaaaaaaaar Main Jaaaaooooooo");
		 
		 
	 }
	    
	    
	}
	

}