package day3;

public class Question7 {

    static int[][] A = {{1, 2}, {3, 4}};
    static int[][] B = {{5, 6}, {7, 8}};

    public static void add() {
        System.out.println("Addition:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void subtract() {
        System.out.println("Subtraction:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] - B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose() {
        System.out.println("Transpose of A:");
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void rowSum() {
        System.out.println("Row sums:");
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j];
            }
            System.out.println("Row " + i + ": " + sum);
        }
    }

    public static void columnSum() {
        System.out.println("Column sums:");
        for (int j = 0; j < A[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i][j];
            }
            System.out.println("Column " + j + ": " + sum);
        }
    }

    public static void main(String[] args) {
        add();
        subtract();
        transpose();
        rowSum();
        columnSum();
    }
}
