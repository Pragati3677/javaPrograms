import java.util.*;
class reverse
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int num;
int rno=0;
System.out.println("Enter a number:");
num = sc.nextInt();
while(num!=0)
{
int digit = num%10;
rno = rno*10+digit;
num = num/10;
}
System.out.println("Reverse no is"+rno);
}
}