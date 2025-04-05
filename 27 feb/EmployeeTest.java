class Employee {
private String firstName;
private String lastName;
private double monthlySalary;
public Employee(String firstName, String lastName, double monthlySalary) 
{
this.firstName = firstName;
this.lastName = lastName;
if (monthlySalary > 0) {
this.monthlySalary = monthlySalary;
} 
else {
this.monthlySalary = 0.0;
}
}
public void setData(String firstName, String lastName, double monthlySalary) {
this.firstName = firstName;
this.lastName = lastName;
if (monthlySalary > 0) {
this.monthlySalary = monthlySalary;
} else {
this.monthlySalary = 0.0;
}
}
public String getData() {
return "Name: " + firstName + " " + lastName + "\nMonthly Salary: " + monthlySalary;
}
public double getYearlySalary() {
return monthlySalary * 12;
}
public void giveRaise() {
this.monthlySalary += this.monthlySalary * 0.10;
}
public double getMonthlySalary() {
return monthlySalary;
}
}

public class EmployeeTest {
 public static void main(String[] args) {
       
Employee emp1 = new Employee("Pragati", "Shendage", 3000.00);
Employee emp2 = new Employee("Prajyot", "Shendage", 4000.00);

System.out.println("Employee 1 Details:");
System.out.println(emp1.getData());
System.out.println("Yearly Salary: " + emp1.getYearlySalary());

System.out.println("\nEmployee 2 Details:");
System.out.println(emp2.getData());
System.out.println("Yearly Salary: " + emp2.getYearlySalary());


emp1.giveRaise();
emp2.giveRaise();

System.out.println("\nAfter 10% raise:");

System.out.println("Employee 1 Details:");
System.out.println(emp1.getData());
System.out.println("Yearly Salary: " + emp1.getYearlySalary());

System.out.println("\nEmployee 2 Details:");
System.out.println(emp2.getData());
System.out.println("Yearly Salary: " + emp2.getYearlySalary());
}
}
