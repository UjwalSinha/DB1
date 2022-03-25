package BASIC;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		a = 10;
		b = 10;
		c = 2;
		
		if((a==b)&&(b==c)&&(c==a))
		{
			System.out.println("Equilateral");
		} else if (a==b&&b==c || b==c&&c==a || c==a&&a==b)
		{
			System.out.println("Isoceles");
		} else
		{
			System.out.println("Scalene");
		}
			

	}

}
