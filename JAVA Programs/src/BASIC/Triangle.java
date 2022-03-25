package BASIC;

public class Triangle {

	public static void main(String[] args) {
		
		int a, b, c;
		a = 2;
		b = 2;
		c = 3;
		
		if(a+b>c && b+c>a && c+a>b)
			System.out.println("valid triangle");
		else
			System.out.println("Not a triangle");
	}

}
