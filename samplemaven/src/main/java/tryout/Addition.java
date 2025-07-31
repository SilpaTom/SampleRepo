package tryout;

public class Addition {

	int a;
	int b;
	int sum;
	
	public void add(int a, int b) 
	{
		this.a=a;
		this.b=b;
		sum=a+b;	
		System.out.println(sum);
		
	
	}
	
	public void average() {
	
		double avg=sum/2;
		System.out.println(avg);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition obj=new Addition();
		obj.add(5, 5);
		obj.average();
				
		
	}

}
