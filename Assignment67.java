package all_Assignments;

public class Assignment67 {
	//Math class is predefined class which is defined in java.lang.package i.e not necessary for import in it
	//Math class contains no of static methods for mathematic  operation
	//also String,Object,System,Thread is predefined class present in java.lang.package
	//Math class have only Static methods
	//Scanner class have non static methods-next(),nextByte(),nextShort(),nextint()......
  final static double pi=3.14;//also we write pi=Math.PI;
	
	public static void main(String[] args) {
		int a=Math.addExact(0100, 200);//Math.addExact(int,int)-return type is int
		long b=Math.addExact(0250000, 3600000);//Math.addExact(long,long)-return type-long	
	    int c=Math.subtractExact(100, 25);//Math.subtractExaxt(int,int)-return type -int-
	    long d=Math.subtractExact(20000, 1500000);//Math.subtractEaxct(long,long)-return type is long
	     int e=	Math.multiplyExact(10,20);//Math.multiplyExact(int, int)-return type -int
	     long f=Math.multiplyExact(10000,20000);//=Math.multiplyExact(d,c);
        long g=Math.multiplyExact(f, e);//Math.multiplyExact(long, int)-return type-int
        float h=Math.min(10.5f, 20f);//Math.min(float,float)-return type-float
		
		int i=Math.min(10, 20);//Math.min(int, int)-return type-int
		//Math.min(double,double)
		//Math.min(long,long);//return type long
	
		//Math.max(float,float);//-return type-float
		//Math.max(long,long);//-return type-long
		//Math.max(int, int);//-return type-int
		//Math.min(double,double);//return type-double
		//Math.abs(double a);//return type double--abs means absolute
	
		double x=Math.abs(-10);//IF Arguments are negative then it give positive value and if arguments are positive then it gives the same positive return
		int y=Math.abs(-0);//if you pass positive or negative zero it gives return in positive zero
		//Math.abs(int);
		//Math.abs(float)
		//Math.abs(long)
		//Math.abs(double )
	System.out.println(x);
	System.out.println(y);

	/*	System.out.println(x);
		
	    //	Math.abs(int a);//return type int
		//Math.abs(long a);//return type long
		//Math.abs(float a);//return type float
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
	//int aa=Math.absExact(10);//Math.absExact(int)-return type int
	//long bb=Math.absExact(-1001215142);//Math.absExact(l0ng)-Return ype-long
	//System.out.println(aa);
	//System.out.println(bb);
	
	
	//double dd=Math.random();//Math.random() will generate any random number between its return double data type 0.0 to 1.0 
	//System.out.println(dd);
	//use Math.random() are used in screenshot/ultra viewer id no
/*	for (int k=0;k<10;i++)
	{
		System.out.println(Math.random());
		
	}*/
	
	//Find out the area of circle where r is Math.random();
	double r=Math.random();

	double area= pi*r*r;
	System.out.println(area);
	//Find out the area of ten circles,where for every circle radius come from Math.random();
	
	
	double aa=Math.random();
	for (int n=0;n<=10;n++)
	{
		System.out.println(Math.PI*aa*aa);
	}
	}

}
