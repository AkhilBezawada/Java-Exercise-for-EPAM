import java.io.*;
import java.util.Scanner;
public class Second
{
	public static void main(String[] args) 
	{
	    int i,n;
	    
	    System.out.println("Enter the size of the array:");
	   Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    System.out.println("Enter the elements:");
	    int a[]=new int[10];
	    
	  a[0]=sc.nextInt();
	  int max=a[0];
	    int min=a[0];
	    for(i=1;i<n;i++)
	    {
		a[i]=sc.nextInt();
	        if(a[i]<min)
	        min=a[i];
	        if(a[i]>max)
	        max=a[i];
	    }
	    System.out.println("Minimum Number is: "+min);
	    System.out.println("Maximum Number is: "+max);
	}
}
