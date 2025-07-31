package tryout;

public class Child implements Parent1, Parent2 
{
	
	public void display3() {
		System.out.println("dispaly3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child obj=new Child();
      obj.display();
      obj.display2();
      obj.display3();
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("dispaly2");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("dispaly");
	}

}
