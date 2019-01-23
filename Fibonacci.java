import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,second=1,third,i;
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(i=0;i<n;i++)
		{
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
			
	}
	
}
