import java.util.*;
class Factorial
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int a = sc.nextInt();
int fact=1;
for(int i=1; i<=a; i++)
{
fact=fact*i;
}
System.out.println("Factorial is"+fact);
sc.close();
}
}