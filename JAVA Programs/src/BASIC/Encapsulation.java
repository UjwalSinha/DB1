package BASIC;

class Student {
	
	private int age;
	private String name;
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String newname) 
	{
		name = newname;
	}
	
	
	public int getage()
	{
		return age;
	}
	
	public void setage(int newage)
	{
		age = newage;
	}
	
}








public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s = new Student();
		s.setName("Ujwal");
		System.out.println(s.getName());
		
		s.setage(18);
		System.out.println(s.getage());
	}

}
