
public class PerfectNumber {

	public static void main(String[] args) {
	int a,sum=0;
	System.out.println("Perfect Numbers are: ");
	for ( int i=1;i<=100;i++) {
		sum=0;
		for(int j=1;j<=i/2;j++) {
			if(i%j==0) {
				sum+=j;
				//System.out.println(i+" "+sum+" "+j);
			}
		}
		if(i==sum) {
			System.out.print(i+" ");
		}
	}
		
	}

}