package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public SuperConstructorChild()
	{
		super(2,6);
		System.out.println("child class constructor");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj=new SuperConstructorChild();

	}

}
