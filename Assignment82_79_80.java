package all_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment82_79_80 {
	//WAP - to find the properties of ArrayList
	
	//Indexing	Duplicates Null Hetrogenious Dynamic size 	Sorted Iteration using Iterator and ListIterator
	//Properties-Arraylist Follows the indexing
	//ArrayList accepts the duplicate values
	//arraylist accepts multiple null value
	//Arraylist change the size at run time
	//Arraylist follows the sorting order if homogeneous values present
    //Arraylist does not follows the sorting order if Heterogeneous values are present
   //with the help of iterator cursor we can retrieve the ArrayList elements in forward direction only
	//with the help of List Iterator we can retrieve the ArrayList Elements in forward and backward Direction
	//In search Case arraylist work fast because it works depends on index
	//in add or remove case Arraylist work slowly in forward and backward depends on index.
	//it is growable in nature.i.e its size changes at run time also
	//its initile size is 10
	// Growable nature value=(Current capacity X 3/2)+1
	
	
	public static void main(String[] args) {
	
	ArrayList a1= new ArrayList();
	
	 a1.add(100);
    a1.add(null);
    a1.add(null);
    a1.add("Rohit");
    a1.add('c');
    System.out.println(a1);
    System.out.println(a1.reversed());
    System.out.println(a1);
           /*  Iterator m1=a1.iterator();
             while(m1.hasNext())
             {
            	 System.out.println(m1.next());
             }*/
             ListIterator m2=a1.listIterator();
             a1.set(1, 13);
            
         
             System.out.println(a1);
             
             while(m2.hasNext()) 
             {
            	 System.out.println(m2.next());
             }
             
             while(m2.hasPrevious()) 
             {
            	System.out.println(m2.previous()); 
             }
            
             
             
            
    System.out.println(a1);
    ArrayList a2= new ArrayList();
    a2.add(1000);
    a2.add("Rohit");
    a2.add(null);
    a2.add("Rohit");
    a2.add('c');
    a1.addAll(a2);
    System.out.println(a2.indexOf("Rohit"));
    System.out.println(a2.lastIndexOf('c'));

    
    System.out.println(a1);
    a1.removeFirst();
    System.out.println(a1);
    a1.removeLast();
    System.out.println(a1);
    System.out.println();
    System.out.println(a1.contains("Rohit"));
    System.out.println(a1.containsAll(a2));
   // Collections.sort(a1);this method is used when all values are Homogeneous  
    //System.out.println(a1);
    
    
		
	
	}

}
