package day3;

import java.util.Arrays;

public class Question9 {

    static int[] numbers = {10, 20, 20, 30, 40, 20};

    public static int min() {
        int min = numbers[0];
        for (int n : numbers) if (n < min) min = n;
        return min;
    }

    public static int max() {
        int max = numbers[0];
        for (int n : numbers) if (n > max) max = n;
        return max;
    }

    public static double average() {
        int sum = 0;
        for (int n : numbers) sum += n;
        return (double) sum / numbers.length;
    }

    public static double median() {
        Arrays.sort(numbers);
        int mid = numbers.length / 2;
        return (numbers[mid - 1] + numbers[mid]) / 2.0;
    }

    public static int mode() {
        int mode = numbers[0], maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {

        System.out.println("Count: " + numbers.length);
        System.out.println("Sum: " + (int)(average() * numbers.length));
        System.out.println("Min: " + min());
        System.out.println("Max: " + max());
        System.out.printf("Average: %.2f\n", average());
        System.out.printf("Median: %.2f\n", median());
        System.out.println("Mode: " + mode());
    }
}
