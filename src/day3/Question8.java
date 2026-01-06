package day3;

public class Question8 {

    public static boolean isValid(String pwd, String user) {

        if (pwd.length() < 8 || pwd.length() > 20 || pwd.contains(" ")) {
            return false;
        }

        if (pwd.toLowerCase().contains(user.toLowerCase())) {
            return false;
        }

        boolean upper = false, lower = false, digit = false, special = false;

        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) upper = true;
            else if (Character.isLowerCase(c)) lower = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }

        return upper && lower && digit && special;
    }

    public static void main(String[] args) {
        String username = "sarthak";
        String password = "S@rthak123";

        if (isValid(password, username)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Invalid password");
        }
    }
}
