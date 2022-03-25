package BASIC;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 55;
		int b = 121;
		int gcd = 1;
		
		for(int i=1; i<a && i<b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
