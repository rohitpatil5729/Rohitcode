package all_Assignments;

public class Assignment32 {
	//Que-wap for Given string 'school" reverse string
	//1st way
	public static void main(String[] args) {
		String a="school";
		for(int a1=a.length()-1;a1>=0;a1--)
		{
			char b1=a.charAt(a1);
			//System.out.println(b1);
			System.out.print(b1);
		}
		
		System.out.println("");
		//2nd way
	String output="";
	 for(int i=a.length()-1;i>=0;i--)
	 {
		 
		 char c=a.charAt(i);
		 output=output+c;
	 }
	 System.out.println(output);
	
	

	
	
	}
}
