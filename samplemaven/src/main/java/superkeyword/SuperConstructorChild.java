package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public SuperConstructorChild( int a, int b)
	{
		super(2,6);
		int sub=a-b;
		//System.out.println("child class constructor");
		System.out.println(sub);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperConstructorChild obj=new SuperConstructorChild(5,2);

	}

}
