package java;
import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[][] = new int[3][3];
int b[][] = new int[3][3];
System.out.println("Enter the Element of Matrix 1");
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the Element of Matrix 2");
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{
b[i][j]=sc.nextInt();
}
}
int add[][] = new int[3][3];
int sub[][] = new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
add[i][j] = a[i][j] + b[i][j];
sub[i][j] = a[i][j] - b[i][j];
}
}
System.out.println("addtion is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(add[i][j]+"\t");
}
}
System.out.print("Substraction is:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(sub[i][j]+"\t");
}
System.out.println();
}
sc.close();
}
}