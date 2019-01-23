import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       boolean temp=true;
       String t1=sc.nextLine().replaceAll(" ","").toLowerCase().trim();
       char a[]=t1.toCharArray();
       Arrays.sort(a);
       int ar[]=new int[26];
       for(int i=0;i<26;i++) {
    	  ar[i]=0; 
       }
       for(int i=0;i<a.length;i++) {
    	   ar[a[i]-97]+=1;
       }
       for(int i=0;i<26;i++) {
    	   if(ar[i]==0) {
    		   temp=false;
    		   break;
    	   }
       }
       
       if(temp==true)
    	   System.out.println("Panagram");
       else
    	   System.out.println("Not");
    	   
	}

}