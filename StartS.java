import java.util.Scanner;
public class StartS {
	public static void main(String[] s)
	{
		 int i;
		 
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        String[] array = new String[n];
        
        System.out.println("Please enter names to sort");              
      
        for (i = 0; i < n;i++){

            array[i] = sc.next();
        }
       
        for(i=0;i<n;i++)
        {
        	char[] ch=array[i].toLowerCase().toCharArray();
        	if(ch[0]=='s')
        	{
        		System.out.println(array[i]);
        	}
        	
        }
	}

}
