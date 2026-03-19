package all_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment43 {
//Assignment 43 -Write program Accept the value of yout array  at the runtime ,
	             //if it is of int datatype size of 4
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	
	 	int[] a=new int[4];
		for (int i=0;i<4;i++)
		{
			a[i]=s1.nextInt();
	
		}
		System.out.println(Arrays.toString(a));
		
		
	String[] ab=new String[4];
	for(int i=0;i<4;i++)
	{
		ab[i]=s1.next();
	}
	System.out.println(Arrays.toString(ab));
	
	boolean[] z=new boolean[3];
	for(int i=0;i<3;i++)
	{
		z[i]=s1.nextBoolean();
	}
	System.out.println(Arrays.toString(z));
	
	/*	practice of scanner class//Area of rectangle=
		System.out.println("enter the value of length side");
		int a12=s1.nextInt();
		System.out.println("enter the value of breath side");
		int a13=s1.nextInt();
		System.out.println("Area of rectangle");
		int a14=a12*a13;
		System.out.println(a14);
		*/
	}
	
	 
	
	

}
