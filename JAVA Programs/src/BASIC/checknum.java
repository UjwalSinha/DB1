package BASIC;

import java.util.Scanner;

public class checknum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int n = num.nextInt();
		
		if(n<0)
			System.out.println("negative number");
		else if(n==0)
			System.out.println("zero number");
		else
			System.out.println("positive number");

	}

}
 