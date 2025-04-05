import java.util.Scanner;

abstract class shape{
protected double dim1, dim2;
shape(double dim1, double dim2){
this.dim1 = dim1;
this.dim2 = dim2;
}
abstract double Area();
}

class Rectangle extends shape{
Rectangle(double length, double width){
super(length, width);
}
double Area(){
return dim1*dim2;
}

}
class triangle extends shape{
triangle(double base, double height){
super(base, height);
}
double Area(){
return 0.5*dim1*dim2;
}
}

public class AreaCalculater {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the length of rectangle");
double length = sc.nextDouble();
System.out.println("Enter the width of rectangle");
double width = sc.nextDouble();
Rectangle r = new Rectangle(length, width);
System.out.println("Area of rectangle" + r.Area());

System.out.println("Enter the base of triangle");
double base = sc.nextDouble();
System.out.println("Enter the height of traingle");
double height = sc.nextDouble();
triangle t = new triangle(base, height);
System.out.println("Area of Triangle is:"+ t.Area());
sc.close();
}

}
