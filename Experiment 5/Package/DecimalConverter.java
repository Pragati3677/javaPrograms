package mathpackage.convert;

public class DecimalConverter {
public static String toBinary(int num) {
return Integer.toBinaryString(num);
}

public static String toOctal(int num) {
return Integer.toOctalString(num);
}

public static String toHex(int num) {
return Integer.toHexString(num).toUpperCase();
}
}
