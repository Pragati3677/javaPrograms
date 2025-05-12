import mathoperation.mathFunction;
class mainMath{
	public static void main(String args[]){
double number1=3.5;
double number2=-2.3;

System.out.println("number"+number1);
System.out.println("floor:"+mathFunction.applyFloor(number1));
System.out.println("ceil:"+mathFunction.applyCeil(number1));
System.out.println("round:"+mathFunction.applyRound(number1));
System.out.println();

System.out.println("number"+number2);
System.out.println("floor:"+mathFunction.applyFloor(number2));
System.out.println("ceil:"+mathFunction.applyCeil(number2));
System.out.println("round:"+mathFunction.applyRound(number2));
}
}