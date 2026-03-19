package all_Assignments;



class rohit{
	 Object ram;
	 
	 public void abc() {
		 System.out.println("i am abc parent class method");
	 }
	 //if return type is different then also possible to override method in parent class
	 Object abcd() {
		 System.out.println("object parent class");
		 return ram;
		 
	 }
	
}





public class RunTimePolymorphismDetails extends rohit {
	//Run Time Polymorphism is also called as dynamic polymorphism.
	//Run time polymorphism is achieved by using method overriding
	//It is also called as dynamic polymorphism.
	//method overriding rules-a)same name b)different class c)same arguments--no of arg same,swquence of arg same,types of arguments must be same
	                           //d)IS-A relation
	
	//JVM can handle the run time polymorphism
	//only non static method are overridden possible
	//constructor overriding is not possible
	//main() JAVA method overriding is not possible becoz it is static method and for overriding object creation is must 
	//access modifier of child class must be wider than parent class
	//if method have different return type then also possible to override .
	//constructor can not be override becoz can not create object of constructor.
	
	int a;
	
	
	
	/*Integer abcd() {
		System.out.println("integer child class ");
		return a;*/
		boolean True;
		
		Boolean abcd(){
			System.out.println("boolean return type of paraent class"); 
			
			return True;
			
		}
		
	
	
	
	
	public void abc() {
		System.out.println("i am abc child class methods");
	}
	public static void main(String[] args) {
		RunTimePolymorphismDetails a1=new RunTimePolymorphismDetails();
		a1.abc();
		rohit a2=new rohit();
		a2.abc();
		a2.abcd();
		rohit a3=new RunTimePolymorphismDetails();
		a3.abc();
		a3.abcd();
		
		
	
	}

}
