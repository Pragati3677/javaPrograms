import java.util.Scanner;

class Employee {
protected String name;
protected String address;
protected double salary;
protected String jobTitle;

Employee(String name, String address, Double salary, String jobTitle){
this.name = name;
this.address = address ;
this.salary = salary;
this.jobTitle = jobTitle;
}
double calculateBonus(){
return salary*0.10;
}
void PerformanceReport(){
System.out.println("Performonce report for:" + name + " job title is:" + jobTitle);
}
void manageProject(){
System.out.println(name+":Managing Project");
}
}

class manager extends Employee{
manager(String name, String address, Double salary, String jobTitle){
super(name, address, salary, jobTitle);
}

double calculateBonus(){
return salary*0.20;
}
void PerformanceReport(){
System.out.println("Performonce report for:" + name + " job title is:" + jobTitle);
}
void manageProject(){
System.out.println("Manager"+name +"Managing Project");
}
} 

class devloper extends Employee{
devloper(String name, String address, Double salary, String jobTitle){
super(name, address, salary, jobTitle);
}
double calculateBonus(){
return salary*0.15;
}
void PerformanceReport(){
System.out.println("Performonce report for:" + name + " job title is:" + jobTitle);
}
void manageProject(){
System.out.println("devloper"+name +"is working on devlopment task");
}
}

class programmer extends Employee{
programmer(String name, String address, Double salary, String jobTitle){
super(name, address, salary, jobTitle);
}
double calculateBonus(){
return salary*0.12;
}
void PerformanceReport(){
System.out.println("Performonce report for:" + name + " job title is:" + jobTitle);
}
void manageProject(){
System.out.println("Programer"+name +" is working on devlopment Program");
}
}


public class company {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter Manager information");
System.out.print("Enter manager name:");
String ManagerName = sc.nextLine();
System.out.print("Enter manager address:");
String address = sc.nextLine();
System.out.print("Enter manager salary:");
double ManagerSalary = sc.nextDouble();
sc.nextLine();
System.out.print("Enter your job title:");
String jobTitle1 = sc.nextLine();
sc.nextLine();

Employee manager = new Employee(ManagerName, address,ManagerSalary, jobTitle1);
System.out.println("Enter Devloper information");
System.out.print("Enter devloper name:");
String devloperName = sc.nextLine();
System.out.print("Enter devloper address:");
String devloperaddress = sc.nextLine();
System.out.print("Enter devloper salary:");
double devloperSalary = sc.nextDouble();
sc.nextLine();
System.out.print("Enter your job title:");
String jobTitle2 = sc.nextLine();
sc.nextLine();

Employee devloper = new Employee(devloperName, devloperaddress, devloperSalary, jobTitle2);
System.out.println("Enter Programmer information");
System.out.print("Enter programmer name:");
String programmerName = sc.nextLine();
System.out.print("Enter programmer address:");
String programmeraddress = sc.nextLine();
System.out.print("Enter programmer salary:");
double programmerSalary = sc.nextDouble();
sc.nextLine();
System.out.print("Enter your job title:");
String jobTitle3 = sc.nextLine();
sc.nextLine();

Employee programmer = new Employee(programmerName, programmeraddress, programmerSalary, jobTitle3);

System.out.println("\nGenerating Reports and Activities");
sc.nextLine();
manager.PerformanceReport();
System.out.println("Bonus is:"+manager.calculateBonus());
manager.manageProject();
sc.nextLine();

devloper.PerformanceReport();
System.out.println("Bonus is:"+devloper.calculateBonus());
devloper.manageProject();
sc.nextLine();

programmer.PerformanceReport();
System.out.println("Bonus is:"+programmer.calculateBonus());
programmer.manageProject();


sc.close();

}
}