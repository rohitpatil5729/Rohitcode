package all_Assignments;

public class Stringf {
	public static void main(String[] args) {
		String s1="i love india";
		char[]a1=s1.toCharArray();
		System.out.println(s1);
		String s2=s1.replaceAll(" ","");
		System.out.println(s2);
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(s2.charAt(i));
		}
		  
		
	}

}
