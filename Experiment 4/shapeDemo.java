interface shape{
public static final double pi = 3.14;
double complete(double d1,double d2);
double compl(double base, double height);
}
class rectangle implements shape{
public double complete(double d1, double d2){

return d1*d2;
}
public double compl(double base, double height){
return 0;
}
}
class triangle implements shape {
public double compl(double base, double height){
return 0.5*base*height;
}
public double complete(double d1, double d2){

return 0;
}
}
public class shapeDemo {

public static void main(String[] args) {
rectangle r1 = new rectangle();
triangle r2 = new triangle();
System.out.println("Area of rectangle:"+ r1.complete(3,5));
System.out.println("Area of triangle:"+ r2.compl(3,6));
}

}
