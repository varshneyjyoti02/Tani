import java.util.Scanner;
public class Student {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks");
	int marks=sc.nextInt();
	if(marks<50)
	{
		System.out.println("Fail");
	}
	
	else if(marks>=50&&marks<=60)
	{
		System.out.println("Pass");
		
	}
	else if(marks>60&&marks<=75)
	{
		System.out.println("First");
		
	}
	else if(marks>75)
	{
		System.out.println("Distinction");
		
	}
	
}

}
