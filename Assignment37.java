package all_Assignments;

import java.util.Date;

public class Assignment37 {
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		Date d2=new Date(d1.getTime());
	
		System.out.println(d2);
		
		String s1=d2.toString();
		System.out.println(s1);
		String Year=s1.substring(s1.length()-4);
		System.out.println(Year);
		String Month=s1.substring(4,7);
		System.out.println(Month);
		String Day=s1.substring(8,10);
		System.out.println(Day);
		String Presenttime=Day.concat("-").concat(Month).concat("-").concat(Year);
		System.out.println(Presenttime);
		
		
		
	}

}
