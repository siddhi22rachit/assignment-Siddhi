package day4;

class AccountNumber {

    private final String digits;

    public AccountNumber(String s) {
        if (isValid(s)) {
            digits = s;
        } else {
            System.out.println("Invalid account number");
            digits = "000000000000";
        }
    }

    public static boolean isValid(String s) {
        if (s.length() != 12) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public String getDigits() {
        return digits;
    }
}

public class Question94 {

    public static void main(String[] args) {

        AccountNumber a = new AccountNumber("123456789012");
        AccountNumber b = new AccountNumber("ABC");

        System.out.println(a.getDigits());
        System.out.println(b.getDigits());
    }
}
