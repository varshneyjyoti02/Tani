import java.util.Scanner;
public class PoweOfTwo {
	public static void main(String[] args) {
		int a;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number: ");
		a = scan.nextInt();
		int n,flag=0;
		int num;
		num=a;
		while(a>=2) {
			n=a%2;
			//System.out.println(n+"*");
			if(n==0) {
				a=a/2;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is in power of 2.");
		}
		else {
			System.out.println(num+ " is NOT in power of 2. ");
		}
	}

}