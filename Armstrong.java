public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len,n,sum=0,num=0;
		System.out.println("Armstrong numbers are: ");
		for ( int i=1;i<=1000;i++) {
			len=String.valueOf(i).length();
			sum=0;
			num=i;
			if(len==1) {
				System.out.print(i+" ");
			}
			else {
				while(num>0) 
				{	
					n=num%10;
					num=num/10;
					sum+=Math.pow(n, len);
				}
				if(sum==i) {
					System.out.print(i+" ");
				}
			}
		}
	}
}