import java.util.*;
public class SumOfDigits 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
sc.close();
        
int sum = 0;
while (number > 0) 
{
sum += number % 10;  
number /= 10;        
}
System.out.println("Sum of digits: " + sum);
}
}
