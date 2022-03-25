package BASIC;

import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
int n=100;

for(int i=2; i<n; i++)
{
	boolean isprime = true;
	for(int j=2; j<i; j++)
	{
		if(i%j==0)
		{
			isprime = false;
			break;
		}
	}
	if(isprime)
		System.out.println(i);
}
	

}

}