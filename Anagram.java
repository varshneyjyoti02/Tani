import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else 
		{
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean status=Arrays.equals(ch1,ch2);
		if(status==true)
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
		}
	}
	

}
