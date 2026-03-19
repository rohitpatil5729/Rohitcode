package all_Assignments;

import java.util.Arrays;

public class Assignment25 {
	//Assignment 25, 26 1. Compare two arrays of Char datatype and 2. Compare two arrays of String datatype
	public static void main(String[] args) {
		String[]s1=new String[3];
		s1[0]="a";
		s1[1]="b";
		s1[2]="b";
	
		String[]s2=new String[3];
		s2[0]="a";
		s2[1]="b";
		s2[2]="b";	  
		boolean b1=Arrays.equals(s1, s2);
		System.out.println(b1);
		String[] s3=new String[4];
		s3[0]="rohit";
		s3[1]="rohit1";
		s3[2]="rohit2";
		s3[3]="rohit3";
		String[] s4=new String[4];
		s3[0]="rohit1212";
		s3[1]="rohit12";
		s3[2]="rohit22";
		s3[3]="rohit32";
		boolean b2=Arrays.equals(s3, s4);
		System.out.println(b2);
	}

}
