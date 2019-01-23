
import java.util.Scanner;

public class PowerOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		while(n%5==0)
		{
			n = n/5;
		}
		if(n!=1)
			System.out.println("Not");
		else
			System.out.println("Yes");
		}

}