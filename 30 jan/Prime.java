import java.util.*;
class Prime
{
public static void main(String arg[])
{
boolean flag=true;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int a = sc.nextInt();
if(a<=1)
{
System.out.println("Given number is not prime number");
		
}
else
{
for (int i = 2; i < a ; i++)
{
if(a % i == 0)
{
flag=false;
break;
}
if(flag)
{
System.out.println("Given number is prime");
}
else
{
System.out.println("given number not prime number");
}	
}
}
}
}