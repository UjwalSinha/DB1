package BASIC;


class A
{
	public void method1()
	{
		
		System.out.println("I am method 1 of Class A");
	}
}

class b extends A
{
	public void method1() 
	{
		
		System.out.println("I am method 1 of Class B");
	}
}

	
public class method_overriding
	{
		

	public static void main(String[] args) {

	A a = new A();
	b b = new b();
	
	a.method1();
	b.method1();
	
	
		

		
		
		
	}

}

