package abstraction;

public class Abstarcatchild extends AbstractionParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstarcatchild obj=new Abstarcatchild();
		obj.print();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}




}