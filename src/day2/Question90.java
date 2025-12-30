package day2;

import java.util.Scanner;

public class Question90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;

        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.println("Enter amount:");
                    balance += sc.nextInt();
                    System.out.println("New Balance = " + balance);
                    break;

                case 3:
                    System.out.println("Enter amount:");
                    int amt = sc.nextInt();
                    if (amt <= balance) {
                        balance -= amt;
                        System.out.println("New Balance = " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}

