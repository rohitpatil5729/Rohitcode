package all_Assignments;

import java.util.Arrays;

public class Assignment78 {
	//Assignment 78  WAP - Copy value of one array into second array in reverse order
	
public static void main(String[] args) {
	
	int[] reelno=new int[4];
	reelno[0]=30;
	reelno[1]=45;
	reelno[2]=125;
	reelno[3]=99;
	int[] reelno1=new int[4];
	System.out.println(reelno.length);
	
	for(int i=0,k=3;i<reelno.length;i++,k--)
	{
		reelno1[k]=reelno[i];
	
	}
	System.out.println(Arrays.toString(reelno));
	System.out.println(Arrays.toString(reelno1));

}     
}
