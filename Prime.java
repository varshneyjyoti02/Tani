
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, n;
		n = sc.nextInt();
		for(i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println("Not prime");
				break;
			}
			
		}
		if(i==(n/2)+1)
			System.out.println("Prime");
	}

}