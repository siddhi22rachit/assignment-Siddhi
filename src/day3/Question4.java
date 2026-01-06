package day3;

public class Question4 {

    static double balance = 0.0;
    static int pin = 1234;

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited. Balance: " + balance);
        }
    }

    public static void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin && amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn. Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed");
        }
    }

    public static void changePin(int oldPin, int newPin) {
        if (oldPin == pin) {
            pin = newPin;
            System.out.println("PIN changed successfully");
        } else {
            System.out.println("Wrong PIN");
        }
    }

    public static void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        deposit(500);
        withdraw(300, 1234);
        printBalance();
        changePin(1234, 4321);
    }
}
