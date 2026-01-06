package day4;

class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    protected void applyFee(double fee) {
        if (fee > 0 && fee <= balance) {
            balance -= fee;
        }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}

public class Question6 {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Sarthak", 1000.0);
        acc.deposit(500);
        acc.withdraw(300);

        System.out.println(acc.getBalance()); // 1200
    }
}
