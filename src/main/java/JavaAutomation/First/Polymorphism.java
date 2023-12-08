package JavaAutomation.First;

public class Polymorphism {

	public static void main(String[] args) {
		// Polymorphism using method overloading
		
		pattern p1 = new pattern();
		
		p1.display();
		System.out.println("\n");
		p1.display('a');
	}

}

class pattern {
	
	//method without parameter
	public void display()
	
	{
		for(int i = 0; i<10; i++) {
			System.out.println("*");
		}
	}
	//method with parameter
public void display(char symbol)
	
	{
		for(int i = 0; i<10; i++) {
			System.out.println(symbol);
		}
	}
}
