import java.util.Scanner;
class NumberSorting
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int k;
int j;
int i;
System.out.print("Enter the size of first sorted array: ");
int m = sc.nextInt();
System.out.print("Enter the size of second sorted array: ");
int n = sc.nextInt();
int[] a = new int[m];
int[] b = new int[n];
int[] c = new int[m + n];

System.out.println("Enter elements of first sorted array:");
for(i = 0; i<m; i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter elements of second sorted array:");
for(j = 0; j<n; j++)
{
b[j] = sc.nextInt();
}
sc.close();
i = 0; 
j = 0; 
k = 0;
sc.close();
while(i<m && j<n)
{
if(a[i]<b[j])
{
c[k++]=a[i++];
}
else
{
c[k++]=b[j++];
}
}
while(i<m)
{
c[k++]=a[i++];
}
while(j<n)
{
c[k++]=b[j++];
}
System.out.println("Sorted array is");
for(i=0; i<k; i++)
{
System.out.print(c[i]+"\t");
}

}
}