package day2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (CtoF / FtoC):");
        String choice = sc.next();

        System.out.println("Enter temperature value:");
        double value = sc.nextDouble();

        if (choice.equalsIgnoreCase("CtoF")) {
            double f = (value * 9 / 5) + 32;
            System.out.println("Fahrenheit = " + f);
        } else if (choice.equalsIgnoreCase("FtoC")) {
            double c = (value - 32) * 5 / 9;
            System.out.println("Celsius = " + c);
        } else {
            System.out.println("Invalid choice");
        }
    }}
