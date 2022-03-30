package BASIC;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);    
		int n = s.nextInt();
		s.close();
		
		int i=2;
		
		for(i=2; i<n-1; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		
		

		

	}

}
