package employee;

public class Emp {
    String name;
    int empid;
    double bpay, hra, da, npay, pf, grosspay, incometax, allowance;

    public Emp(String name, int empid, double bpay){
        this.empid = empid;
        this.name = name;
        this.bpay = bpay;
    }
    public void calculateSalary(){
        da = 0.05*bpay;
        hra = 0.09*bpay;
        pf = 0.11*bpay;
        allowance = 0.10*bpay;
        grosspay = bpay+da+hra+allowance;
        incometax = 0.10*grosspay;
        npay = grosspay-(pf+incometax);
    }
    public void displaySalary(){
        System.out.println("Employee ID:"+empid);
        System.out.println("Employee name:"+name);
        System.out.println("Basic salary:"+bpay);
        System.out.println("DA "+da);
        System.out.println("HRA:"+hra);
        System.out.println("PF"+pf);
        System.out.println("Allowance"+allowance);
        System.out.println("Gross pay:"+grosspay);
        System.out.println("income tax"+incometax);
        System.out.println("net pay"+npay);
    }
}
