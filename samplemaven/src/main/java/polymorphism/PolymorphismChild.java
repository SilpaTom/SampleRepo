package polymorphism;
//overriding
public class PolymorphismChild  extends PolymorphismParent{
public void display(int a, int b) {
	
	System.out.println(a-b);
	super.display(5,3); // to get the pa
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismChild obj= new PolymorphismChild();
		obj.display(5,3);
	}

}
