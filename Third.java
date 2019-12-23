import java.util.Scanner;
public class Third
{
public static void main(String[] args)
{
System.out.println("Enter the size of the array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter the elements in the array");
int a[]=new int[100];
System.out.println("Enter the element you want to search");
int search=sc.nextInt();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(search==a[i])
break;
}
if(i==n)
System.out.println("-1");
else
 System.out.println(i);
}
}
