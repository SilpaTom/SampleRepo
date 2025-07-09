package interfaceexample;

public class Child implements Parent1,Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj=new Child();
		obj.display();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" printing the parent2");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" printing the parent1");
	}

}
