package all_Assignments;

import java.util.PriorityQueue;
import java.util.Queue;

public class PropertiesOfQueue {
public static void main(String[] args) {
	Queue a1=new PriorityQueue();
   
	a1.add("Rohit");
	a1.add("null");
	a1.add("true");
	a1.add("null");
	
	Queue a2=new PriorityQueue();
	   
	a2.add("Rohit");
	a2.add("null");
	a2.add("false");
	a2.add("1919");
	a1.retainAll(a2);
	System.out.println(a1);
	
     a1.offer("piya");
   
	a1.add("1212");
	a1.add("rohit");
	System.out.println(a1);
	a1.add("Ram");
	System.out.println(a1);
  a1.remove("Rohit");
  System.out.println(a1);
  a1.remove();
  System.out.println(a1);
  a1.remove();
  System.out.println(a1);

}
}
