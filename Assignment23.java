package all_Assignments;

public class Assignment23 {
	final static double pi=Math.PI;
	//Assignment 23 Area of Circle using Math.random()
	//final variable is global variable so it is not inside the main method;
	public static void main(String[] args) {
		double r=Math.random();
		
		double AreaofCircle=pi*r*r;
		System.out.println(AreaofCircle);
		//
	//find out the area of 10 circle where every circle radius is Math.random();
		
		for (int i=0;i<10;i++)
			
		{
			//System.out.println(r);
			System.out.println(AreaofCircle);
		}
	
	}


}
