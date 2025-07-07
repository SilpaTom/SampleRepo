package accesmodifiers;

public class AccesModifiers1 {
	
	public void display()
	{
		System.out.println("public");
	}
	private void display2()
	{
		System.out.println("private");
	}
	
	protected void display3()
	{
		System.out.println("protected");
	}
	
	void display4()
	{
		System.out.println("default");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesModifiers1 obj=new AccesModifiers1();
		obj.display();		
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
