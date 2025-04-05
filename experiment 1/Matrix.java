import java.util.*;

class Matrix {
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
int a[][] = new int[2][2];
int b[][] = new int[2][2];
int result[][] = new int[2][2];
        
System.out.println("Enter elements of the first 2x2 matrix:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
a[i][j] = sc.nextInt();
}
}
System.out.println("Enter elements of the second 2x2 matrix:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
b[i][j] = sc.nextInt();
}
}
System.out.println("Choose an operation: ");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Transpose of first matrix");
int choice = sc.nextInt();
        
switch (choice) {
case 1:
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = a[i][j] + b[i][j];
}
}
System.out.println("Resultant Matrix after Addition:");
break;
            
case 2:
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = a[i][j] - b[i][j];
}
}
System.out.println("Resultant Matrix after Subtraction:");
break;

case 3:
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
result[i][j] = 0;
for (int k = 0; k < 2; k++) {
result[i][j] += a[i][k] * b[k][j];
}
}
}
System.out.println("Resultant Matrix after Multiplication:");
break;

case 4:
System.out.println("Transpose of the first matrix:");
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(a[j][i] + " ");
}
System.out.println();
}
sc.close();
return;
            
default:
System.out.println("Invalid choice!");
sc.close();
return;
}
        
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
        
sc.close();
}
}
