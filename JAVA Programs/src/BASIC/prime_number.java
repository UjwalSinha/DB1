package BASIC;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		
		int div = 2;
		boolean isprime = true;
		while(div<=n-1)
		{
			if(n%div == 0)
			{
				isprime = false;
			}
			div ++;
		}
		if(isprime)
			System.out.println("prime");
		else
			System.out.println("composite");
		
	
		
		
		
				
				
		
		

		
		
		
	}

}
