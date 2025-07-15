package exceptionhandling;

public class ThrowEg {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=16;
		if(age>18) {
			System.out.println("eligible for vote");
			
		}
		else {
			throw new NumberFormatException("not eligible to vote");
		}

	}

}
