import java.util.Scanner;

public class Main
{
	    public static void main(String[] args)
	    {
	        int flag=0,check,j,i;
	        int[] temps = new int[100];
	        System.out.println("enter the number");
         	Scanner input = new Scanner(System.in);
            int number = input.nextInt();
			System.out.println("The Prime numbers are:");
	     	for(i=2;i<=number;i++)
	     	{
	     	    flag=0;
		       for(j=2;j<i/2;j++)
		      {
		          if(i%j==0)
		         {
		            flag=1;
		            break;
		         }
		      }
		      if(flag==0)
	     	{
	     	    System.out.println(i);
	     	}
		      
	     	}
	     	
		
	}
}
