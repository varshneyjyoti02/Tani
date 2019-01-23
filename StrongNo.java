import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No");
		int no=sc.nextInt();
		int temp=no;
		int rem,i,fact=1,sum=0;
		while(no!=0)
		{
			fact=1;
			rem=no%10;
			no=no/10;
			for(i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Strong No");
		}
		else
			System.out.println("Not Strong No");
	}
}
