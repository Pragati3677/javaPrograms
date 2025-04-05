import java.util.*;

class student{
int rollNo;
String name;

void setRollNo(int rollNo){
this.rollNo = rollNo;
}
int getRollNo(){
return rollNo;
}
void setName(String name){
this.name = name;
}
String getName(){
return name;
}

}
class Test extends student{
int sub1;
int sub2;
void setMarks(int sub1, int sub2){
this.sub1 = sub1;
this.sub2 = sub2;
}
int getMarks1(){
return sub1;
}
int getMarks2(){
return sub2;
}
}
interface Sports {
void setSportsMarks(int marks);
}
class Result extends Test implements Sports{
int sportsMarks;
public void setSportsMarks(int marks) {
this.sportsMarks = marks;
}

void dispalay(){
System.out.println("Roll number: "+ getRollNo());
System.out.println("Name:" + getName());
System.out.println("Marks in subject 1:" + getMarks1());
System.out.println("Marks in subject 2:" + getMarks2());
System.out.println("Sports Marks:" + sportsMarks);
System.out.println("Total Marks:" + (getMarks1()+getMarks2() +sportsMarks));
}
}
public class StudentExamResults {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Result r = new Result();

System.out.print("Enter the roll number:");
int rollNo = sc.nextInt();
r.setRollNo(rollNo);

sc.nextLine();
System.out.print("Enter the name:");
String name = sc.nextLine();
r.setName(name);

System.out.print("Enter Marks in subject 1:");
int sub1 = sc.nextInt();
System.out.print("Enter marks in subject 2:");
int sub2 = sc.nextInt();
r.setMarks(sub1, sub2);

System.out.print("Enter the sports Marks:");
int sportsMarks = sc.nextInt();
r.setSportsMarks(sportsMarks);

r.dispalay();

sc.close();

}
}
