package all_Assignments;

import java.util.Date;

public class Assignment39 {
	//Past Time
	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(d1.getTime()-(1000*60*60*24*2));
		String s1=d2.toString();
		System.out.println(s1);
		String Year=s1.substring(s1.length()-4);
		String Month=s1.substring(4,7);
		String Day=s1.substring(8,10);
		String PastTime=Day.concat("-").concat(Month).concat("-").concat(Year);
		System.out.println(PastTime);
		
		
	}

}
