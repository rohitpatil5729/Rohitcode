package all_Assignments;

import java.util.LinkedHashSet;

public class PropertiesOfLinkedHastSet {
	public static void main(String[] args) {
		LinkedHashSet s1=new LinkedHashSet();
		s1.add(100);
		s1.add(10);
		s1.add("Rohit");
		s1.add(1000);
		s1.add("Rohit");
		s1.add(null);
		s1.add(null);
		s1.add(null);

       
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		LinkedHashSet clonea1=new LinkedHashSet();
		clonea1=(LinkedHashSet) s1.clone();
		System.out.println(clonea1);
		System.out.println(s1.reversed());

		
		System.out.println(s1);
		System.out.println(s1.getClass());
	}

}
