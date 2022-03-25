package BASIC;

import java.util.Scanner;

public class Scanner_SI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner p = new Scanner(System.in);
		System.out.println("Enter Priciple");
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Interest rate");
		
		Scanner t = new Scanner(System.in);
		System.out.println("Enter time");
		
		int principle = p.nextInt();
		int rate = r.nextInt();
		int time = t.nextInt();
		int si;
		
		si = principle*(1+rate*time);
		System.out.println(si);
		
		
	}

}
