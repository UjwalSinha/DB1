package BASIC;

import java.util.Scanner;

public class Scanner_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner firstnumber = new Scanner(System.in);
		System.out.println("enter first number");
		
		Scanner secondnumber = new Scanner(System.in);
		System.out.println("enter second number");
		
		Scanner thirdnumber = new Scanner(System.in);
		System.out.println("enter third number");
		
		int a = firstnumber.nextInt();
		int b = secondnumber.nextInt();
		int c = thirdnumber.nextInt();
		int avg;
		avg = (a+b+c)/3;
		System.out.println(avg);
	}

}
