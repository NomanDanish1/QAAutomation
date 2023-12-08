package JavaAutomation.First;

public class Abstraction {

	public static void main(String[] args) {
		
                    mountainbike m1 = new mountainbike();
                    m1.brake();

                    sportsbike s1 = new sportsbike();
                    s1.brake();
	}

}




//abstract class is which has abstract method and abstract method has no body
abstract class motorbike{
	
	abstract void brake();
	
}


class sportsbike extends motorbike{

	public void brake()
	{
		System.out.println("This is sportsbike");
	}

	
}

class mountainbike extends motorbike{
	
	public void brake()
	{
		System.out.println("This is mountainbike");
	}
}