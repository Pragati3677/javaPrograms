import java.util.*;
class BankAccount{
double balance;
BankAccount(double b){
balance = b;
}
void deposite(double amount){
if(amount>0){
balance += amount;
System.out.println("Deposited rupees" + amount);
} else{
System.out.println("Deposited amount must be positive");
}
}
void withdraw(double amount) {
if (amount > 0 && balance >= amount) {
balance -= amount;
System.out.println("Withdrawn rupees " + amount);
} else {
System.out.println("Insufficient balance or invalid amount");
}
}
void displayBalance(){
System.out.println("Current balance: " + balance);
}    

}
class savingAccount extends BankAccount {
static double minBalance = 100;
savingAccount(double b){
super(b);
}
void withdraw(double amount){
if(balance - amount > minBalance){
super.withdraw(amount);
}
else{
System.out.println("minimum balance of rupees 100");
}
}
}
public class BankApp{
public static void main(String[] args)  {
Scanner sc = new Scanner(System.in);
System.out.println("Enter initial balance");
double b = sc.nextDouble();
savingAccount SA = new savingAccount(b);

while(true){
System.out.println("\n1Deposite \n2.Withdrow \n3.Display Balance \n4.Exit");
System.out.println("choose an option");
int choice = sc.nextInt();

switch(choice){
case 1:
System.out.println("Enter deposite Amount:");
double depositeA = sc.nextDouble();
SA.deposite(depositeA);
break;

case 2:
System.out.println("Enter withdrow Amount");
double wAmount = sc.nextDouble();
SA.withdraw(wAmount);
break;

case 3:
SA.displayBalance();
break;

case 4:
System.out.println("Exting");
return;

default:
System.out.println("invalid choice plase try again");

}

}
}
}
