import java.util.Arrays;
import java.util.Scanner;
public class Panagram {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=sc.nextLine();
	int len=a.length();
	boolean status=true;
	char[] ch=a.toLowerCase().toCharArray();
	int i=0;
	Arrays.sort(ch);
	for(i=0;i<len;i++)
	{
		

	if('a'<=ch[i]&&ch[i]<='z')
	{
		i=ch[i]-'a';
		ch[i]=1;
		
	}
	
	}
	

for(i=0;i<=25;i++)
{
	if(ch[i]==1)
	{
		status=true;
	}
	else
		status=false;
	}

if(status==true)
{
	System.out.println("Panagram");
}
else
	System.out.println("Not Panagram");
}
	
}
