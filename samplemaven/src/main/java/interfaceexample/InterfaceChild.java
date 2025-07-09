package interfaceexample;

public class InterfaceChild implements InterfaceParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.print();
      
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		   System.out.println("display method overriding from parant interface");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		   System.out.println("print method overriding from parant interface");
		
	}

}
