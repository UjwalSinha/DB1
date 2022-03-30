package BASIC;

import java.util.Scanner;

public class Sal {
	
	public void sal()
	{
		Scanner S = new Scanner(System.in);
		double basic = S.nextInt();
		char grade = S.next().charAt(0);
		S.close();
		
		
		double hra = (20*basic)/100;
		double pf = (11*basic)/100;
		double da = (50*basic)/100;
		int allowance = 0;
		
		if(grade == 'A')
		{
			allowance = 1700;
		}
		else if(grade == 'B')
		{
			allowance = 1500;
		}
		else if(grade == 'C')
		{
			allowance = 1300;
		}
		
		
		double ts = basic + hra + da + allowance - pf;
		
		System.out.println((int)(Math.round(ts)));
		
	}
	
	
	
	public static void main (String args[]) {
		Sal s = new Sal();
		s.sal();

			
	}
		
}


