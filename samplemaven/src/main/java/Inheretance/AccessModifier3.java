package Inheretance;

import accesmodifiers.AccesModifiers1;

public class AccessModifier3 extends AccesModifiers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesModifiers1 obj= new AccesModifiers1();
		obj.display();// only public can be accesses outside4
		
		// 
		AccessModifier3 obj1=new AccessModifier3();
		
		obj1.display();
		obj1.display3();
		
	}
	
	
}
