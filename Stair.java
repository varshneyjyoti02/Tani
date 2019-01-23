import java.util.Scanner;

public class Stair {

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	static int countWays(int s) {
		return fib(s + 1);
	}

	public static void main(String args[]) {
		int s;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the no. of stairs: ");
		s = sc.nextInt();
		System.out.println("Number of ways = " + countWays(s));
	}
}