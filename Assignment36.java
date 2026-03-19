package all_Assignments;

import java.util.Arrays;

public class Assignment36 {
	
	
	//Assignmnet 36 In given String find how many are alphabets,how many are special character,
	                             //how many are numeric,	how many are Spaces
	public static void main(String[] args) {
		String s1="Rohit Patil";
		char[] c1=s1.toCharArray();
		//Character.is
		System.out.println(c1);
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=	Character.isLetter(c1[0]);
		System.out.println(b1);
		}
		
		String s2="rohit patil 770983  8486";
		int total_no_of_alphabets=0;
		char[] c2=s2.toCharArray();
		/*for(int i=0;i<s2.length();i++)
		{
			boolean b2=Character.isLetter(c2[i]);
			System.out.println(b2);
			
			if(b2==true)
			{
				total_no_of_alphabets++;
			}
			System.out.println(total_no_of_alphabets);
		}*/
		int total_space=0;
		for (int i=0;i<s2.length();i++)
		{
			boolean b2=Character.isWhitespace(c2[i]);
			System.out.println(b2);
			
			if(b2==true) 
			{
				total_space++;
			}
			System.out.println(total_space);
		}
		int countofletter=0;
		int countofspace=0;
		int countofNeumricvalue=0;
		
		String s11=" rohitPatilKBP College @@@-+121212AA";
		char[]a11=s11.toCharArray();
		for(int i=0;i<s11.length();i++)
		{
			boolean b1=Character.isLetter(a11[i]);
			if(b1==true)
			{
				countofletter++;
			}
			
		}
		System.out.println(countofletter);
		for(int i=0;i<s11.length();i++)
		{
			boolean b1=Character.isWhitespace(a11[i]);
			if (b1==true) 
			{
				countofspace++;
			}
		}
		System.out.println(countofspace);
		for(int i=0;i<s11.length();i++) 
		{
			boolean b1=Character.isDigit(a11[i]);
			if(b1==true)
			{
				countofNeumricvalue++;
			}
		
	
		}
		System.out.println(countofNeumricvalue);
		
		int m1=countofspace+countofletter+countofNeumricvalue;
		int specialchar=s11.length()-m1;
		System.out.println(specialchar);
		int countofUpperCase=0;
		for(int i=0;i<s11.length();i++)
		{
		boolean b1=Character.isUpperCase(a11[i]);	
		if(b1==true)
		{
		countofUpperCase++;
		}
		
		}
		System.out.println(countofUpperCase);
		int countoflowercase=0;
		for(int i=0;i<s11.length();i++)
		{
			boolean b1=Character.isLowerCase(a11[i]);
		
			if(b1==true)
			{
				countoflowercase++;
			}
		}
		System.out.println(countoflowercase);
	
	 
		
	}
	
	
		
		
	
		
	

}
