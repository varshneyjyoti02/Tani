import java.util.Scanner;
public class FirstNonRepeating {
	
	
	public static void main(String args[])
	{Scanner o=new Scanner(System.in);
	String str=o.nextLine();
	String s=str.toUpperCase();
	int a[]=new int[26];
	int i,f=0;
	for(i=0;i<s.length();i++)
	{a[s.charAt(i)-'A']++;}
	for(i=0;i<s.length();i++)
	{if(a[s.charAt(i)-'A']==1)
	{f=1;break;}
	}
	if(f==1)
	System.out.println(s.charAt(i));
	else
	System.out.println("Every character is repeating");
	}
	}


