package all_Assignments;

public class Assignment94 {
	
 //	Assignment 94 WAP - of SIB
//SIB-STATIC INITILAISE BLOCK
//It will executive always first but main method of java require must onward java version 1.6
//no of SIB write in single class program and it executive one by one
//static block is used to initilise static and non static varibles.
//static block always outside the main methods
//JVM will always executive the static block first at the time of class loading into jvm memory.
//	
  static int a, b, c;
	static {
		a=10;
		System.out.println(a);
		System.out.println("Hello");
	}

 {
		a=10;
		b=20;
		System.out.println(a);
	}
 Assignment94()
 {
	 System.out.println("hi");
 }
 Assignment94(int d){
	this();
	 System.out.println("i am parameterised constructor");
 }
 static void abc() {
	 System.out.println("i am abc static method");
	 
 }
	public static void main(String[] args) {
		System.out.println("i am main method");
		Assignment94 a1=new Assignment94(10);
		abc();
		
	}
	
}
