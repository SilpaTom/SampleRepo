package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratoreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> a=new HashSet<String>();
		a.add("apple");
		a.add("banana");
		a.add("orange");
		System.out.println(a);
		//iterate() method
		//crating object for Iterator interface
		// i=  variable pointing to iterator
		Iterator i=a.iterator();
		while(i.hasNext()) 
		{
		System.out.println(i.next());
			
		}
		i.remove();
		System.out.println(a);
		
		//for each loop
		int array[]= {1,3,4,6};
		for(int b:array) {
			System.out.println(b);
		}
		
		for(String c:a) {
			System.out.println(c);
		}

	}

}
