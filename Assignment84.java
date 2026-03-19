package all_Assignments;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment84 {
	//Assignment 84
	//WAP - to find the properties of Set Indexing Duplicates Null Hetrogenious Dynamic size
     //   	Sorted,Iteration using Iterator and ListIterator
	//Set does not follows the indexing
	//Set does not store duplicate values
	//Set store only one null value not more than one null value.
	//Set does not follow the insertion order
	//Set can store homogeneous and heterogeneous elements
	//Sorting is also not possible if Homogeneous Values in set, Sorting is not possible if Heterogeneous Values are present
	//Set is an Dynamic nature.its size can be change at the run time
	//Set concept is used during application becoz they are unique and for hiding the information from user.

	public static void main(String[] args) {
		
		
		
		String r1="rohit";
		char[] c1=r1.toCharArray();
		  for (int i=0;i<r1.length();i++)
		    {
		    	System.out.println(c1[i]);
		    }
		  System.out.println(Arrays.toString(c1));
		System.out.println(c1);
		
		Set s1= new HashSet();//upcasting needs for fetching the properties of Set interface becoz we can not create the object of interface.
	        s1.add(100);
	        s1.add(120);
	        s1.add(100);
	        s1.add(300);
	        s1.add(10);
	        s1.add(10.0);
	        Set s2= new HashSet();//upcasting needs for fetching the properties of Set interface becoz we can not create the object of interface.
	        s2.add(1000);
	        s2.add(120);
	        s2.add(1000);
	        s2.add(100);
	        s2.add(10.0);
	        s2.add(10.0);
	        System.out.println(s2);
	        System.out.println(s1.retainAll(s2));
	        System.out.println(s1);
	       
	       
	      
	        
	      /*  System.out.println(s1.toString());
	        System.out.println(s2);
	        Object[] a4=s2.toArray();//convert set to array
	        for (int i=0;i<s2.size();i++)
	        {
	        	System.out.println(a4[i]);
	        }
	        
	        System.out.println(s1);
	        System.out.println(s1.getClass());
	  boolean b1=     s1.equals(s2);
	  System.out.println(b1);
	        s1.clear();
	        System.out.println(s1);
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
	/*    Object[] a3=s1.toArray();
	  
	    
	    for (int i=0;i<s1.size();i++)
	    {
	    	System.out.println(a3[i]);
	    }
	    System.out.println(a3);
	        System.out.println(s1);
	       boolean b1= s1.contains(100);
	       s1.remove(100);
	       s1.removeAll(s1);
	       System.out.println(s1);
	       System.out.println(s1.isEmpty());
	       System.out.println(b1);
	        
	         Iterator m1=     s1.iterator();
	         while(m1.hasNext())
	         {
               System.out.println(m1.next());	        	 
	         }
*/
	
	
	
	}

	

	

}


