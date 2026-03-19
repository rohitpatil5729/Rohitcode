package all_Assignments;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;

public class PropertiesOfArrayDeque {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		a1.add(100);
		a1.add(100);
		a1.add(20);
		a1.add(96);
		a1.add(10.5);
		ArrayDeque clonea1=new ArrayDeque();
		clonea1=(ArrayDeque)a1.clone();
		System.out.println(clonea1);
		System.out.println(a1.reversed());
		
   /*    Iterator a5= a1. descendingIterator();
       while(a5.hasNext()) 
       {
    	   System.out.println(a5.next());
       }*/
		
       
	Object[]a2=a1.toArray();
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a2[i]);
	}
	
		System.out.println(a1);
	}

}
