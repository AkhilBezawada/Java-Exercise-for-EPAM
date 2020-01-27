import java.io.*;
import java.util.Scanner;
class Practice4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
if(a<0)
System.out.println(a+ " is a negative number");
else if(a==0)
System.out.println("The given number is neither positive nor negative");
else
System.out.println(a+ " is a positive number");
}
}
