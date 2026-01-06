package day3;

import java.util.ArrayList;

public class Question1 {

    public static int evaluate(String expr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> operators = new ArrayList<>();

        int i = 0;

        // -------- Tokenization --------
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (ch == ' ') {
                i++;
                continue;
            }

            // Read number
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                numbers.add(num);
                continue;
            }

            // Read operator
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            } else {
                System.out.println("Invalid expression");
                return 0;
            }
            i++;
        }

        // -------- Handle * and / --------
        for (int j = 0; j < operators.size(); j++) {
            char op = operators.get(j);

            if (op == '*' || op == '/') {
                int a = numbers.get(j);
                int b = numbers.get(j + 1);
                int res = (op == '*') ? a * b : a / b;

                numbers.set(j, res);
                numbers.remove(j + 1);
                operators.remove(j);
                j--;
            }
        }

        // -------- Handle + and - --------
        int result = numbers.get(0);
        for (int j = 0; j < operators.size(); j++) {
            char op = operators.get(j);
            if (op == '+') {
                result += numbers.get(j + 1);
            } else {
                result -= numbers.get(j + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Direct input expression
        String expression = "12 + 3 * 4 - 5 / 2";

        int result = evaluate(expression);
        System.out.println("Result: " + result);
    }
}
