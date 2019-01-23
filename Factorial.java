



import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, c=1;
		n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			c = c*i;
		}
		System.out.println(c);

	}

}