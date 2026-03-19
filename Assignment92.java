package all_Assignments;

public class Assignment92 {
	//WAP - for continue keyword.	Print 1 to 10 by skipping number 4

	public static void main(String[] args) {
		int i;
		for (i=1;i<=10;i++)
		{
			if(i==4) {
				continue;
			}
			System.out.println(i);
			
		}
	}
}
