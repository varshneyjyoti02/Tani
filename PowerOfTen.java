import java.util.Scanner;
public class PowerOfTen {
	
	public static void main(String[] args)
	{int rem=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	
	while(no>1)
	{
		rem=no%10;
		no=no/10;
		if(rem!=0)
			break;
		
	}
	if(no==1 && rem==0)
	System.out.println("true");
	else
		System.out.println("false");
}
	
}
