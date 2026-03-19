package all_Assignments;
class encapsulationdetails{
	private String username ="rohitpatil@gmail.com";
	private String password="rohit121212";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	/*public String getpassword() {
		
		return password;
		
	}
	
	
	
	public void setpassword(String password) {
		this.password=password;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public String getusername() {
		
		return username;
		
	}
	
	
	
	public void setusername(String username) {
		this.username=username;
		
	}*/



}

public class Assignment93 {
	//Assignment 93 WAP - for Encapsulation
	
	
	public static void main(String[] args) {
		encapsulationdetails a1=new encapsulationdetails();
	/*a1.setusername("priyapatil@gmail.com");
	       // System.out.println(a1.getusername());
		a1.setpassword("priya121212");
		//System.out.println(a1.getpassword());*/
		a1.setPassword("pari1212122");;
		System.out.println(a1.getPassword());
	}

}
