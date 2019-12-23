import java.io.*;
import java.util.Scanner;
public class First
{
	public static void main(String[] args) 
	{
	    int i,n,sum=0;
	    float avg;
	    System.out.println("Enter the size of the array:");
	   Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    System.out.println("Enter the elements:");
	    int a[]=new int[10];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        sum=sum+a[i];
	        
	    }
	    System.out.println("Sum is: "+sum);
	    avg=(float)sum/n;
	    System.out.println("Average is: "+avg);
	    
	}
}

