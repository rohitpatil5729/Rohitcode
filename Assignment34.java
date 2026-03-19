package all_Assignments;

import java.util.Arrays;

public class Assignment34 {
	//Assignment 34  Find out if given two string are anagram of each other
	
public static void main(String[] args) {
	String s1="begin";
	System.out.println(s1.length());
	String s2="being";
	String s3="was";
	String s4="saw";
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	char[] c3=s3.toCharArray();
	char[] c4=s4.toCharArray();
	   Arrays.sort(c1);
	   Arrays.sort(c2);
	   Arrays.sort(c3);
	   Arrays.sort(c4);
	   boolean b1=Arrays.equals(c1,c2);
	   boolean b2=Arrays.equals(c3,c4);
	   if(b1==true && b2==true) 
	   {
		System.out.println("strings are anagram");   
	   }
	   else 
	   {
		   System.out.println("strings are not anagram");
	   }
	   
	
}	
	

	

}
