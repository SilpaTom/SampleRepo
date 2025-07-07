package Inheretance;

public class MultilevelChild  extends MultilevelParentB{
	
	public void display3()
	{
		System.out.println("child");
		
		
	}

	public static void main(String[] args) {
	
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.display2();
		obj.display3();

	}

}
