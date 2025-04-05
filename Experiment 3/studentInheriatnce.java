import java.util.Scanner;
class student{
int rollno;
void get_rollNo(int rollno){
this.rollno = rollno;
}
void displayRollno(){
System.out.println("Roll number is" +rollno);
}
}

class test extends student{
int sub1;
int sub2;
void getSubjectMark(int sub1, int sub2){
this.sub1=sub1;
this.sub2=sub2;
}
void DisplaySubjectMark(){
System.out.println("Marks of sub 1 is:" + sub1);
System.out.println("Marks of sub 2 is"+ sub2);
}
}

class result extends test{
void displayResult(){
int total = sub1+sub2;
displayRollno();
DisplaySubjectMark();
System.out.println("Total marks is" + total);
}
}
public class studentInheriatnce {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
result r = new result();
System.out.print("Enter Roll No: ");
int roll = sc.nextInt();
r.get_rollNo(roll);

System.out.print("Enter marks of Subject 1: ");
int marks1 = sc.nextInt();
System.out.print("Enter marks of Subject 2: ");
int marks2 = sc.nextInt();
r.getSubjectMark(marks1, marks2);

r.displayResult();
sc.close();
}
}
