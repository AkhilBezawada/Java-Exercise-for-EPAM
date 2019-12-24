import java.io.*;
import java.util.Scanner;
class Fifth
{
public static void main(String[] args)
{
int i,n;
System.out.println("Enter the size of the array: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter the elements to be stored into the array: ");
int a[]=new int[100];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int largest1,largest2,temp;
largest1=a[0];
largest2=a[1];
if(largest1<largest2)
{
temp=largest1;
largest1=largest2;
largest2=temp;
}
for(i=2;i<n;i++)
{
if(a[i]>largest1)
{
largest2=largest1;
largest1 = a[i];
}
else if(a[i]>largest2 && a[i]!=largest1)
{
largest2=a[i];
}
}
System.out.println ("The First largest is " + largest1);
System.out.println ("The Second largest is " + largest2);
int smallest1,smallest2,temp1;
smallest1=a[0];
smallest2=a[1];
if(smallest1>smallest2)
{
temp1=smallest1;
smallest1=smallest2;
smallest2=temp1;
}
for(i=2;i<n;i++)
{
if(a[i]<smallest1)
{
smallest2=smallest1;
smallest1=a[i];
}
else if(a[i]<smallest2 && a[i]!=smallest1);
{
smallest2=a[i];
}
}
System.out.println("The first smallest number is "+smallest1);
System.out.println("The second smallest number is: "+smallest2);
}
}
