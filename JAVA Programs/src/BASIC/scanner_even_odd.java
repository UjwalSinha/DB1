package BASIC;

import java.util.Scanner;

public class scanner_even_odd {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		
		int n = num.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		

	}

}
