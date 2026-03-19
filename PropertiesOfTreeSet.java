package all_Assignments;

import java.util.TreeSet;

public class PropertiesOfTreeSet {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(1000);
		t1.add(10);
		t1.add(100);
		t1.add(101);
		t1.add(105);
		t1.add(556);
		t1.add(10001);
		System.out.println(t1.reversed());
		String s="Rohit";
		char[] c1=s.toCharArray();
		for(int i=0;i<s.length();i++) 
		{ 
			System.out.println(s.charAt(i));
		}
	
		System.out.println(t1);
		System.out.println(t1.floor(800));
		System.out.println(t1.ceiling(800));
		System.out.println(t1.descendingSet());
	
		TreeSet t2=new TreeSet();
		t2.add(10);
		t2.add(1000);
		t2.add(100);
		t2.add(10);
		t2.add(105);
		t2.descendingSet();
		System.out.println(t2);
		System.out.println(t1.first());
		System.out.println(t1.equals(t2));
		TreeSet clonea10=new TreeSet();
		clonea10=(TreeSet) t1.clone();
		System.out.println(clonea10);
		System.out.println(t1);
		System.out.println(t2);
		TreeSet clonea20=new TreeSet();
		clonea20=(TreeSet)t2.clone();		
	System.out.println(t2);
		
		/*t1.removeFirst();
		t1.removeLast();
		t1.clear();*/
		System.out.println(t1.contains(10));
		System.out.println(t1.size());
		Object[] a1=t1.toArray();
		for (int i=0;i<t1.size();i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println(t1);
		System.out.println(t1.isEmpty());
		//System.out.println(t1.getLast());
		
	}
	

}
