import mathpackage.MathOperations;
import mathpackage.convert.DecimalConverter;
import mathpackage.convert.BaseConverter;

public class MainApp {
public static void main(String[] args) {
int num = 5;
System.out.println("Factorial of " + num + ": " + MathOperations.factorial(num));
System.out.println("Cube of " + num + ": " + MathOperations.cube(num));

System.out.println("Binary of " + num + ": " + DecimalConverter.toBinary(num));
System.out.println("Octal of " + num + ": " + DecimalConverter.toOctal(num));
System.out.println("Hexadecimal of " + num + ": " + DecimalConverter.toHex(num));

System.out.println("Binary '101' to Decimal: " + BaseConverter.binaryToDecimal("101"));
System.out.println("Octal '7' to Decimal: " + BaseConverter.octalToDecimal("7"));
System.out.println("Hex 'A' to Decimal: " + BaseConverter.hexToDecimal("A"));
}
}
