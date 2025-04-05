package java;
import java.util.Scanner;
class NumberSorting
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int m=4;
int n=3;
int k=0;
int j=0;
int i=0;
int a[] = new int[m];
int b[] = new int[n];
int c[] = new int[m+n];
System.out.println("Enter the element for array A");
for(i = 0; i<m; i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter the element for array B");
for(j = 0; j<n; j++)
{
b[j] = sc.nextInt();
}
while(i<m && j<n)
{
	if(a[i]<b[j])
	{
	c[k]=a[i];
	i++;
	k++;
	}
	else
	{
	c[k]=b[j];
	j++;
	k++;
	}
	k++;
}
while(i<m)
{
	c[k]=a[i];
	i++;
	k++;
}
while(j<n)
{
	c[k]=b[j];
	j++;
	k++;
}
System.out.println("Sorted array is");
for(i=0; i<k; i++)
{
	System.out.println(c[i]);
}
sc.close();
}
}