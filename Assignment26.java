package all_Assignments;

import java.util.Arrays;

public class Assignment26 {
	////Assignment 25, 26 1. Compare two arrays of Char datatype and 2. Compare two arrays of String datatype
public static void main(String[] args) {
	char[] a1=new char[3];
	a1[0]='m';
	a1[1]='d';
	a1[2]='e';
	char[] a2=new char[3];
	a2[0]='m';
	a2[1]='d';
	a2[2]='e';
	
boolean b11=	Arrays.equals(a1,a2);
System.out.println(b11);
	
char[] a3=new char[3];
a3[0]='m';
a3[1]='e';
a3[2]='e';
char[] a4=new char[3];
a4[0]='m';
a4[1]='d';
a4[2]='e';
boolean b22=Arrays.equals(a3,a4);
System.out.println(b22);

	
	
}

}
