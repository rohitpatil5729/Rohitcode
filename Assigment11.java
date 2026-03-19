package all_Assignments;

import java.util.Scanner;

public class Assigment11 {
static float pi=3.14f ;
	
	//WAP for calculating area of a circle,rectangle,square,triangle,trapezium.also calculating circumference of circle,rectangle and square using Scanner Class (user inputs)
  //scanner class is predefined class in java,which is present in java.util.package
	//it is used to accept  the human input at the run time
	//scanner class is predefined class which contains the non static methods so for calling the non static method we can create the object of the class 
	
	
	public static void main(String[] args) {
		Scanner a1=new Scanner(System.in);//scanner constructor is always parameteries constructor//System is the predefined class which is present in java,lang.package which is need not to import when it used	}
System.out.println("please enter your name");
  String name=a1.next();
 //AREA OF CIRCLE=PIXRXR

/*  System.out.println("enter the value of s1");
  int s1=a1.nextInt();
  System.out.println("enter the value of s2");
  int s2=a1.nextInt();
  System.out.println("Area of circle");

  double Area_of_Circle =pi*s1*s2;//here scanner is non static method and pi is static veriable
  System.out.println(Area_of_Circle);*/
  //Area of rectangle
 /* System.out.println("enter the value of 1st side length");
    double s11=a1.nextDouble();
    System.out.println("enter the value of 2nd side breath");
      int s12=a1.nextInt();
      System.out.println("Area of rectange");
      double s13= s11*s12;
      System.out.println(s13);*/
  //Area of the square=a*a
 /* System.out.println("enter the length value of side ");
              int m1= a1.nextInt();
             int  Areasquare=m1*m1;
             System.out.println("Area of square");
             System.out.println(Areasquare);*/
  //Area of triangle
  System.out.println("enter the value of triangle base");
  byte b1=a1.nextByte();
  System.out.println("enter the value of perpendiculare height");
     int b5= a1.nextInt();
     System.out.println("Area Of rectangle");
                double AreaOfTriangle=0.5*b1*b5;
                System.out.println(AreaOfTriangle);
  
              
  
      

  
  

}
	
}
