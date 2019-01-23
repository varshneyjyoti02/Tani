
import java.util.Scanner;

public class PrimeFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=2; i<=n; i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n = n/i;
			}
		}
	}

}