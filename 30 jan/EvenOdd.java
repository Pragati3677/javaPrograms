import java.util.*;
class EvenOdd
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a = sc.nextInt();
if(a%2==0)
{
System.out.print("The given number is even");
}
else
{
System.out.print("The given number is odd");
}
}
}