import java.util.*;
class Add
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter value for a");
int a = sc.nextInt();
System.out.println("Enter value for b");
int b = sc.nextInt();
int c=a+b;
System.out.println("sum is:"+c);
sc.close();
}
}