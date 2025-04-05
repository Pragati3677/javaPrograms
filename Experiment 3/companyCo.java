
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.1; // 10% bonus
    }

    public String generatePerformanceReport() {
        return name + " - " + jobTitle + " - Performance Report";
    }

    public void manageProjects() {
        System.out.println("Managing projects...");
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, String address, double salary, String department) {
        super(name, address, salary, "Manager");
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus
    }
}

class Developer extends Employee {
    String programmingLanguages;

    public Developer(String name, String address, double salary, String programmingLanguages) {
        super(name, address, salary, "Developer");
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void manageProjects() {
        System.out.println("Developing and managing projects...");
    }
}

class Programmer extends Employee {
    String specialization;

    public Programmer(String name, String address, double salary, String specialization) {
        super(name, address, salary, "Programmer");
        this.specialization = specialization;
    }
}

public class companyCo{
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "123 Main St", 80000, "IT");
        Developer developer = new Developer("Jane Smith", "456 Oak Ave", 70000, "Java, Python");
        Programmer programmer = new Programmer("David Lee", "789 Elm St", 60000, "Data Science");

        System.out.println("Manager Bonus: " + manager.calculateBonus());
        System.out.println("Developer Report: " + developer.generatePerformanceReport());
        programmer.manageProjects();
    }
}