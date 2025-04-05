import employee.Emp;
import java.util.Scanner;
class Emppay {
    public static void main(String[] args) {
        Scanner sc = new Scanner("System.in");
        System.out.println("Enter employee name");
        String name = sc.nextLine();
        System.out.println("Enter Employee id:");
        int ID = sc.nextInt();
        System.out.println("Enter employee basic salay");
        double bpay = sc.nextDouble();

        Emp ob = new Emp(name, ID, bpay);
        ob.calculateSalary();
        ob.displaySalary();
        sc.close();
    }

}
