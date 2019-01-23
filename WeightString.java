import java.util.Arrays;
import java.util.Scanner;
public class WeightString {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.nextLine();
		char[] ch=a.toLowerCase().toCharArray();
		int i=0;
		int sum=0;
		Arrays.sort(ch);
		int len=a.length();
		for(i=0;i<len;i++)
		{
			

		if('a'<=ch[i]&&ch[i]<='z')
		{
			sum=sum+ch[i]-96;
	}
		}
		System.out.println(sum);
	}
}

