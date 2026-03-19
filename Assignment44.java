package all_Assignments;

public class Assignment44 {
	//Assignmnet 44-Create a array of size of 5 and  just check 34 is present or not
	
	public static void main(String[] args) {
		int[] roll_no=new int[5];
		roll_no[0]=10;
		roll_no[1]=36;
		roll_no[2]=39;
		roll_no[3]=40;
		roll_no[4]=34;
		int check =34;
		int numbercheck=40;
		for(int i=0;i<5;i++)
		{
			if(check==roll_no[i])
			{
			System.out.println("the given no->" + check +"is the part of given array");	
			}	
		}
		for (int i=0;i<5;i++)
		{
			if(numbercheck==roll_no[i]) 
			{
				System.out.println("the given no->" +numbercheck  +"is present in array");
			}
		}
		
		//Assignmnet 44-Create a array of size of 5 and  just check 34 is present or not .
		int[] reel_no=new int[5];
		 reel_no[0]=12;
		 reel_no[1]=21;
		 reel_no[2]=34;
		 reel_no[3]=39;
		 reel_no[4]=44;
		 int reelcheckno=34;
		 
		 for(int i=0;i<5;i++)
		 {
			 if(reelcheckno==reel_no[i])
			 {
				System.out.println("the given reelcheckno->"+ reelcheckno+ "  is part of an array");
				 System.out.println("the given reecheckno->"+ reelcheckno+ " is the part of an array"+"  have index no is->" + i);
				 System.out.println(i);
			 }
		 }
		
		
	}

}
