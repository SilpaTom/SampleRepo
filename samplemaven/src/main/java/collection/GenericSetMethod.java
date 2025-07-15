package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> a=new HashSet<String>();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		System.out.println(a);
		Set <String> b=new HashSet<String>();
		b.add("banana");
		b.add("kiwi");
		System.out.println(b);
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("banana"));
		System.out.println(a.containsAll(b));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.remove("banana");
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
