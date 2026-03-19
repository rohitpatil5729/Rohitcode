package all_Assignments;

public class Assignment91 {
	//Assignment 91 WAP for Assert keyword
	//assert keyword is used to check the exact matching with expected result and actual observed result
public static void main(String[] args) {
	int  a=15;
	int b=51;
	//syntax 1) assert condition;
	//syntax 2) assert condition:("any type of message")
	//if we disable assert then do please set asset
	//right click then go to run configuration then select argument then go to vm argu. then insert -ea then apply
	
	//using syntax1)
	//assert a==b;
	System.out.println(a+b);
	//using syntax2)
	assert a==b:("not equal");
	System.out.println("ok");
	
}
	
	
	
}
