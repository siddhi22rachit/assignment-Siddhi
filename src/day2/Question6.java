package day2;

public class Question6 {

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Madam";

        if (isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

