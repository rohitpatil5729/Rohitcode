package stringbuffer;

public class stringbuffermethods {
	public static void main(String[] args) {
		/*StringBuffer a1=new StringBuffer("automation");
		System.out.println(a1.length());
		System.out.println(a1.capacity());
		a1.append("testing");
		System.out.println(a1);*/
		StringBuffer a1=new StringBuffer("automation testing");
		//System.out.println(a1.replace(0, 10, "API"));
		//System.out.println(a1.delete(0, 10));
		System.out.println(a1.substring(03));
		System.out.println(a1.substring(03, 12));
		System.out.println(a1.insert(5, "API"));
		System.out.println(a1.insert(3,"R"));
		System.out.println(a1.indexOf("t"));
		System.out.println(a1.charAt(5));
		System.out.println(a1.replace(0, 1, "r"));
		
	}

}
