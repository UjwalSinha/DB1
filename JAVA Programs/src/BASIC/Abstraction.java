package BASIC;

abstract class Dog{
	
	public void bark()
	{
		System.out.println("bark");
	}
	
	public abstract void poop();
}

class cat extends Dog {

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("poop");
	}
	

}

public class Abstraction  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat	c = new cat();
		c.bark();
		c.poop();
		
		

	}

}
