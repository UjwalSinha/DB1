package BASIC;

public class method_overloading {
	
		public void add(int a, int b)
		{
			int s = a+b;
			System.out.println(s);			
		}
		
		public void add(int a, int b, int c)
		{
			int s = a+b+c;
			System.out.println(s);
		}
		
		public String add(String s)
		{
			System.out.println(s);
			return s;
		}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method_overloading m = new method_overloading();
		m.add(2, 6);
		m.add(2, 3, 12);
		m.add("Prakash");
		
		
		
	}

}
