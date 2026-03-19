package all_Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AssignmentNo83 {
	//Assignment 83WAP - to find the properties of List Indexing,Duplicates,null,hetrogeneous,
	                   //Dynamic size Sorted Iteration using Iterator and ListIt
public static void main(String[] args) {
	           List a1  =new ArrayList();
	           a1.add(100);
	           a1.add(null);
	           a1.add(null);
	           a1.add("Rohit");
	           a1.add('c');
	           a1.set(2,500);
	           System.out.println(a1);
	          // a1.clear();
	          // System.out.println(a1);
	           //System.out.println(a1.isEmpty());
	          //List Follows indexing,also accept duplicates
	          //List accepts dupicate values
	           //List follows insertion order
	           //list store homogeneous and hetrogenous types of values
	           //we can store multiple null value in single list of set.
	           //also we can reserved the all elements
	           //we can retrive the elements by using iterator and list iterator cursor
	           /* a1.reversed();
	           System.out.println( a1.reversed());*/
	             Iterator m1      =a1.iterator();
	         /*  while(m1.hasNext()) //this method check given element is present if yes then go to inside loop
	             {
	            	 System.out.println(m1.next());//Element return type
	             }*/
	           for(int i=0;i<a1.size();i++)
	           {
	        	   System.out.println(m1.next());
	           }
	           System.out.println(a1);
	    ListIterator m2=a1.listIterator();
	    a1.set(1,5);
	
	   
	    while(m2.hasNext())
	    {
	    	System.out.println(m2.next());
	    }
	    while(m2.hasPrevious())
	    {
	    	System.out.println(m2.previous());
	    }
	       //ListIteratorcursor have following methods
	    //listIterator is an interface also it is one type of cursor
	    //hasNext();
	    //Next();
	    //hasPrevious();
	    //previous();
	    //remove();
	    //set(index,object)
	    //with the help of listiterator we can retrive the element in forward and backword direction
	    //With the help of listiterator cursor we can read,replace,add,remove the elements.
	        	   
	        	   
	           

	
	
}
}
