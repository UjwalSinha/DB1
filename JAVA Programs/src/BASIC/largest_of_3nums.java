package BASIC;

import java.util.Scanner;

public class largest_of_3nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = a.nextInt();
		Scanner b = new Scanner(System.in);
		System.out.println("Enter num2");
		int num2 = b.nextInt();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter num3");
		int num3 = c.nextInt();
		
		if(num1>num2 && num2>num3)
			System.out.println("num1 is largest");
		else if(num2>num3 && num3>num1)
			System.out.println("num2 is largest");
		else
			System.out.println("num3 is largest");
		 
		
	}

}
