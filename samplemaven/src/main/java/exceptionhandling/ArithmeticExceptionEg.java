package exceptionhandling;

public class ArithmeticExceptionEg {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=0;
		try {
		int c=a/b;
		}
//		catch (ArithmeticException e)
//		{
//			b=2;
//			int d =a/b;
//		System.out.println("the divided value at  catch: " +d);	
//		System.out.println("exception  is: " +e);
//		}
//		System.out.println("the divided valu is: ");
		
		finally
		{
			
			b=2;
			int d =a/b;
			System.out.println("the divided value at  catch: " +d);	
		}
		System.out.println("sdxcfvgbhnm ");
	}

}