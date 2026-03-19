package all_Assignments;

public class Call_Static_Method_toMainMethod {
	
	
	public static void abc() {
		System.out.println("Welcome");
		
	}
	
	public static void main(String[] args) {
		abc();//directly
		Call_Static_Method_toMainMethod.abc();//using class name
		Call_Static_Method_toMainMethod a=new Call_Static_Method_toMainMethod();
		a.abc();//using creation of object
		
	
		
	}

}
