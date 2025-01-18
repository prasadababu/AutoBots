package frank;

// Abstract class representing the ATM Machine
abstract class ATM {
    abstract void authenticateUser(String pin);

    abstract void withdrawMoney(double amount);

    abstract void checkBalance();
}

// Concrete class implementing the abstract methods
class RealATM extends ATM {
    private double balance = 1000;

    @Override
    void authenticateUser(String pin) {
        // Logic to authenticate user, e.g., checking pin
        System.out.println("User authenticated successfully!");
    }

    @Override
    void withdrawMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        ATM atm = new RealATM();
        atm.authenticateUser("1234");
        atm.checkBalance();
        atm.withdrawMoney(200);
    }
}
