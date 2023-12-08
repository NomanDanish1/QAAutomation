package JavaAutomation.First;
//main class to access other classes
public class Inheritance {
	
	public static void main (String[] args)
	{
		child a = new child();
		
		a.one="what is your problem";
		a.two=500;
		
		a.eat();
		
	}
	
	
	
}

//parent class or super class

class parent{
	
String one;
int two;

public void eat()
{
	System.out.println("This is Parent class");
}

}

//child class

class child extends parent{
//override function with using super class function in child class
public void eat()
{
	super.eat();
	System.out.println(one);
	System.out.println(two);
	
}
}
