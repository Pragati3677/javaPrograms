class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

// Custom exception for negative numbers
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

// BankAccount class
class BankAccount {
    double balance = 1000; // Starting balance

    void balanceEnquiry() {
        System.out.println("Balance: ₹" + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount can't be negative");
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) throws NegativeNumberException, LowBalanceException {
        if (amount < 0) {
            throw new NegativeNumberException("Amount can't be negative");
        }
        if (amount > balance) {
            throw new LowBalanceException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.balanceEnquiry();

        try {
            acc.deposit(500);       // valid
            acc.withdraw(200);      // valid
            acc.deposit(-100);      // invalid
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            acc.withdraw(2000);     // invalid
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        acc.balanceEnquiry();
    }
}