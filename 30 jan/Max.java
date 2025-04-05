import java.util.*;
class Max
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number for a");
int a = sc.nextInt();
System.out.println("Enter number for b");
int b = sc.nextInt();
System.out.println("Enter number for c");
int c = sc.nextInt();
int max;
if(a>b && a>c)
{
max=a;
}
else if(b>a && b>c)
{
max=b;
}
else
{
max=c;
}
System.out.print("Maximum number is:"+max);
}
}