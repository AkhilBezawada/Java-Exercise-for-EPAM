import java.io.*;
import java.util.Scanner;
class Sixth
{
public static void main(String[] args)
{
int i,n,temp;
System.out.println("Enter the size of the array: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the elements to be sorted: ");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++) 
{
for(int j=i+1;j<n;j++) 
{
if(a[i]>a[j]) 
{
temp=a[i];
a[i]=a[j];
a[j] = temp;
}
}
}
System.out.println("Ascending Order:");
for(i=0;i<n-1;i++) 
{
System.out.println(a[i] + ",");
}
System.out.println(a[n - 1]);
}
}
