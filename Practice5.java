import java.io.*;
import java.util.Scanner;
class Practice5
{
public static void main(String[] args)
{
int remainder;
  boolean isPrime=true;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=2;i<=a/2;i++)
{
remainder=a%i;
System.out.println(a+" Divided by "+i+" gives remainder "+remainder);
if(remainder==0)
     {
        System.out.println("Its is neither prime nor composite number");
        break;
     }
  }
  if(isPrime)
     System.out.println(a+ " is a Prime number");
  else
     System.out.println(a+ " is not a Prime number");
    }
}
