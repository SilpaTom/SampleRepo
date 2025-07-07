package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationParent ref;
	
	// ref variable of parent  class should pass as a parameter/local variable in the child class constructor 
	//AggregationParent ref =parentclassname variable name
	//AggregationParent= user defined class name as datatype
	//also create a instance variable variable , use this keyword 
	public AggregationChild(String city,String state,AggregationParent ref)
	{
		this.state=state;
		this.city=city;
		this.ref=ref;
	}
	
 public void display() {
	 System.out.println(city+" "+state);
	 // println the parent class properties
	 System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object for parent class &pass parameters 
		//then create obj for child class and pass parameters("kochi","kerala",obj1),
		//parent class object is also a paramer
		//then invoke the method to display parent and child class properties using the child class object  ie, obj2
		AggregationParent obj1=new AggregationParent("silpa",10,"asdfgh");
		AggregationChild obj2=new AggregationChild("kochi","kerala",obj1);
		obj2.display();

	}

}
