package day2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0, oddSum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Sum of Even = " + evenSum);
        System.out.println("Sum of Odd = " + oddSum);
    }
}

