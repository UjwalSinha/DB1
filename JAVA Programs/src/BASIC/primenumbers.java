package BASIC;


public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n=100;

		
for(int i=2; i<n-1; i++) //11
{
	boolean isprime = true;
	for(int j=2; j<i-1; j++)
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