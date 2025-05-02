import java.util.*;
class LowBalanceException extends Exception{
public LowBalanceException(String message){
super(message);
}
}
class NegativeNumberException extends Exception{
public NegativeNumberException(String message){
super(message);
}
}
class BankAccount{
double balance;
public BankAccount(double initialBalance){
this.balance = initialBalance;
}
public void balanceEnquiry(){
System.out.println("Current Balance:"+balance);
}
public void deposit(double amount) throws NegativeNumberException{
if(amount<0){
throw new NegativeNumberException("cannot deposit a negative amount");
}
balance += amount;
System.out.println("Deposited"+amount);
} 
public void withdraw(double amount)throws LowBalanceException,NegativeNumberException{
if(amount<0){
throw new NegativeNumberException("Cannot withdraw an negative amount");
}
if(amount > balance){
throw new LowBalanceException("Insufficient balance to withdraw"+amount);
}
balance -= amount;
System.out.println("Withdrawn"+amount);
}
}
class BankApp{
public static void main(String args[]){
BankAccount account = new BankAccount(5000);

try{
account.balanceEnquiry();
account.deposit(2000);
account.withdraw(1000);
account.withdraw(7000);
}
catch(NegativeNumberException e){
System.out.println("Error:" +e.getMessage());
}catch(LowBalanceException e){
System.out.println("Error"+e.getMessage());
}
try{
account.deposit(-500);
}catch(NegativeNumberException e){
System.out.println("Error"+e.getMessage());
}
account.balanceEnquiry();
}
}