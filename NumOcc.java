import java.util.Scanner;

public class NumOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String a=sc.next().toLowerCase();
	        int max=-1;
	        int l[]=new int[26];
	        for(int i=0;i<26;i++)
	        	l[i]=0;
	        int i=0;
	        while(i!=a.length()) {
	        	l[a.charAt(i)-97]+=1;
	        	i++;
	        }
	        for(i=0;i<26;i++)
	        {
	        	if(l[i]>0) {
	        		System.out.println("occurence of "+(char)(i+97)+" is:"+l[i]);
	        	}
	        }

	}

}