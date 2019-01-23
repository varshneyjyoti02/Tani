import java.util.Scanner;

public class PasTriangle {

	public static int fact(int n)
	{
		int f=1;
		if(n==0 || n==1)
			return 1;
		for(int i=2;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	public static int comb(int n,int r) {
		
		int rs;
		rs=fact(n)/(fact(r)*fact(n-r));
		return rs;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(comb(i,j)+" ");
			}
			System.out.println();
		}
		

	}

}