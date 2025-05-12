package mathpackage.convert;

public class BaseConverter {
public static int binaryToDecimal(String binary) {
return Integer.parseInt(binary, 2);
}

public static int octalToDecimal(String octal) {
return Integer.parseInt(octal, 8);
}

public static int hexToDecimal(String hex) {
return Integer.parseInt(hex, 16);
}
}
