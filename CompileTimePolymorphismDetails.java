package all_Assignments;

public class CompileTimePolymorphismDetails {
	//two types-1)Compile Tile Polymorphism,2)	Run Time Polymorphism
	//1)Compile time polymprphism can be done with the help of method overloading
    //2)compile time polymorphism is also called as static polymorphism
	//3)Compiler handle the compile time polymorphism at the time of class loading
	//4)for overloading-a)same class b)same method name c)different arguments-different arguments,sequence of arguments diff,no of arguments diff
    //for compile time polymorphism we can use public ,private,protected,default access specifier uses
    //Que-Can we override main method-yes
	//Parent class and child class relation is not required for method overloading
	//constructor is also overloading
	//final method overloading is possible in same class.
	
	

	
	CompileTimePolymorphismDetails(){
		this(10);
	
		
		System.out.println("non parameterised constructor");
		
	}
	CompileTimePolymorphismDetails(int a){
		
	
		System.out.println("parameterised constructor");
		
	}
	CompileTimePolymorphismDetails(String a){
		this();
		
	
		System.out.println("String parameterised constructor");
		
	}
	
	
public void abc() {
	
	System.out.println("i am abc non static non parameterised method");
	
}
public void abc(int q) {
	
	System.out.println("i am abc non static method");
	
}
public static void abc(int m,String b) {
	
	System.out.println("i am abc non static double parameterised method");
	
}
public void main() {
	System.out.println("non static main method");
	
}


public static void main(String[] args) {
	CompileTimePolymorphismDetails a1=new CompileTimePolymorphismDetails("");
	a1.abc();
	a1.abc(10);
	abc(10,"ram");
	a1.main();
	
	
	
}
	
	
	
	


}
