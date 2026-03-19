package all_Assignments;

import java.util.Arrays;

public class Assignment35 {
	//Assignment 35 	Copy the value of one array to another array using iteration
	public static void main(String[] args) {
		int [] a=new int[3];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		int [] a2=new int[3];
		for(int i=0;i<3;i++)
		{
            a2[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2));
		
	}
	
	

}
