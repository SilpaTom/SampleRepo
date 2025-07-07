package Inheretance;

public class SingleInheritanceChild extends SingleInheritanceParent{

	public void print()
	{
		System.out.println("child");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritanceChild  obj=new SingleInheritanceChild();
		
		obj.display();
		obj.print();

	}


}
