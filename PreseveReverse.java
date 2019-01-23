import java.util.Scanner;
public class PreseveReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String s1=sc.next();
          String s2="";
          int i;
          char[] ch1=s1.toCharArray();
          char[] ch2=s2.toCharArray();
          for(i=0;i<s1.length();i++)
          {
        	  if(ch1[i]==' ')
        	  {
        		  ch2[i]=' ';
        	  }
        	  
        	  
          }
          int j=s1.length();
          for(i=0;i<s1.length();i++)
          {
        	  if(ch1[i]==' ')
        	  {
        		  for(int k=i;k<=j;k++)
        		  {
        			  ch1[k]=ch1[k+1];
        		  }
        		  j--;
        	  }
          }
          int l=s1.length();
          for(i=0;i<l;i++)
          {
        	  char temp=ch1[i];
        	  ch1[i]=ch1[l-i-1];
        	  ch1[l-i-1]=temp;
        	  System.out.println(ch1[i]);
          }
     /*     for( k=0;k<=s1.length();k++)
          {
        	if(ch2[k]!=' ') {  
        		
        		ch2[k]=ch1[k];
        	}
        	else
        		ch2[k+1]=ch1[k];
          
          System.out.println(ch2[k]);
	}*/
	}

}
