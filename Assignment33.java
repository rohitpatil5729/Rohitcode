package all_Assignments;

public class Assignment33 {
//Que -check if given string is palindrome or not Ex:-Malayalam
	public static void main(String[] args) {
		
		String a1="Malayalam";
		String output="";
		
		for(int i=a1.length()-1;i>=0;i--)
		{
			char c=a1.charAt(i);
			output=output+c;
	    }
		System.out.println(output);
		
		if(a1.equals(output)==true) //why not palidrome bcoz java is case sensative lang.
		{
			System.out.println("palindrome");
		}
		else{
            System.out.println("it is not palindrome");			
		    }
	String b="madam";
	String output1="";
	for(int i1=b.length()-1;i1>=0;i1--)
	{
	    char c1=b.charAt(i1);
	   //  output1=output1+c1;
	     output1=output1+c1;
	}
	  System.out.println(output1);
	
	if(output1.equals(b)==true) 
	{
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("it is not palindome");
		
	}
	}
	

}
