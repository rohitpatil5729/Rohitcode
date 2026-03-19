package all_Assignments;

public class Assignment95 {
	//Assignment 95 WAP - of IIB
	
	//this is IIB
	Assignment95(int a){
		System.out.println("i am parameterised constructor");
	}
	{
		System.out.println("weclcome to ICICI BANK");
	}
	Assignment95(){
		System.out.println("i am non parameterised constructor");
	}
	
	
	public static void main(String[] args) {
		//Assignment95 a1=new Assignment95();
		Assignment95 a1=new Assignment95(100);
		System.out.println("i am main branch");
		//Assignment95 a1=new Assignment95();
		Assignment95 a2=new Assignment95();
		
	}

}
