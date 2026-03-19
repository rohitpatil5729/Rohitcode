package all_Assignments;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment81 {
	
	//Assignment 81  WAP - for iteration of Stack and Vector using Enumeration
    //Properties Of vector class
	public static void main(String[] args) {
		
		Vector v1=new Vector();
		v1.add("rohit");
		v1.add(null);
		v1.add(10);
		v1.add(10);
		v1.add(10);
		v1.add(null);
		System.out.println(v1);
		       Enumeration e1= v1.elements();
		       while(e1.hasMoreElements())
		       {
		    	   System.out.println(e1.nextElement());
		       }
		   Iterator m1=    v1.iterator();
		    while(m1.hasNext())
		    {
		    	System.out.println(m1.next());
		    }
		   ListIterator l1= v1.listIterator();
		   while(l1.hasNext())
		   {
			   System.out.println(l1.next());
		   }
		   while(l1.hasPrevious())
		   {
			   System.out.println(l1.previous());
		   }
		    
		    
		    
		    
		    
		    
		Vector v2=new Vector();
		v2.add("pari");
		v2.add("ram");
		v2.add('r');
		v2.add(500);
		v1.addAll(v2);
		System.out.println(v2);
		System.out.println(v1);
		v1.addAll(2,v2);
		System.out.println(v1);
		Object[] a1=v1.toArray();
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println(v1);
		v1.addElement(99);
		System.out.println(v1);
		Vector clonea1=new Vector();
		clonea1=(Vector)v1.clone();
		System.out.println(clonea1);
		
		v1.clear();
		System.out.println(v1);
		
		
		
	}
	
	

}
