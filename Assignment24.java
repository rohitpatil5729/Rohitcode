package all_Assignments;

public class Assignment24 {
			//Que -To create array problem on double, char and boolean data type
	public static void main(String[] args) {
		//always write array in main java method
		int[] roll_no=new int[3];
		roll_no[0]=10;
	    roll_no[1]=20;
	    roll_no[2]=30;
	    String[] student_name=new String[4];
	    student_name[0]="Rohit0";
	    student_name[1]="Rohit1";
	    student_name[2]="Rohit2";
	    student_name[3]="Rohit3";
	    double[] rs=new double[2];
	    rs[0]=10.25;
	    rs[1]=12.22;
	    boolean[] ram=new boolean[4];
	    ram[0]=true;
	    ram[1]=true;
	    ram[2]=false;
	    ram[3]=true;
	    char[] c=new char[2];
	    c[0]='a';
	    c[1]='b';
	    //Que-Create an array of size 3 and store more data///then array indexOutOfBoundsException
	     
	  /*  int[] reel_no=new int[3];
	    reel_no[0]=50;
	    reel_no[1]=55;
	    reel_no[2]=60;
	    reel_no[3]=55;
	    reel_no[4]=60;
	    for (int i=0;i<3;i++)
	    {
	    	System.out.println(i);
	    }*/
	    
	    //if we provide size of an array is negative then program successfully compiled but NegativeArraySizeException show at run time
	   /* int[] reel=new int[-5];
	   
	    System.out.println(reel);
	    */
	    
	    //if we provide sie of an array is zero(0) then program successfully compiled and also give successful output at run time
	    int[] value=new int[0];
	    
		   
	    System.out.println(value);
	    String s1=value.toString();
	    System.out.println(s1);
	    
	
	
	
	
	}
	
}
