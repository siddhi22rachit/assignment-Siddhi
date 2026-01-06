package day3;

public class Question5 {

    public static String dayOfWeek(int d, int m, int y) {

        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday",
                         "Wednesday", "Thursday", "Friday"};

        return days[h];
    }

    public static void main(String[] args) {
        int day = 25, month = 12, year = 2025;
        System.out.println(dayOfWeek(day, month, year));
    }
}
