package day3;

public class Question2 {

    static String[] names = {"Alice", "bob", "Charlie"};
    static int[] grades = {90, 82, 76};

    public static void printAll() {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "(" + grades[i] + ") ");
        }
        System.out.println();
    }

    public static void printTopper() {
        int max = grades[0];
        int index = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                index = i;
            }
        }
        System.out.println("Topper: " + names[index] + "(" + max + ")");
    }

    public static void classAverage() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        double avg = (double) sum / grades.length;
        System.out.printf("Average: %.2f\n", avg);
    }

    public static void searchByName(String search) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Found: " + names[i] + "(" + grades[i] + ")");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        printAll();
        printTopper();
        classAverage();
        searchByName("Bob");
    }
}
