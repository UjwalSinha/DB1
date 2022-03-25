package BASIC;

public class sumofevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int sum = 0;
		int s = 0;
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				sum = sum+i;
				
			}
			
		}
		System.out.println(sum);
	}

}
