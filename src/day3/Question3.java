package day3;

public class Question3 {

    public static int[] countVowels(String s) {
        int[] v = new int[5]; // a e i o u

        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a') v[0]++;
            else if (c == 'e') v[1]++;
            else if (c == 'i') v[2]++;
            else if (c == 'o') v[3]++;
            else if (c == 'u') v[4]++;
        }
        return v;
    }

    public static void main(String[] args) {

        String text = "Hello, world! Java 17 is amazing.";

        int words = text.trim().split("\\s+").length;
        int sentences = 0, digits = 0, letters = 0;

        for (char c : text.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') sentences++;
            if (Character.isDigit(c)) digits++;
            if (Character.isLetter(c)) letters++;
        }

        String longest = "";
        for (String w : text.replaceAll("[^a-zA-Z ]", "").split(" ")) {
            if (w.length() > longest.length()) longest = w;
        }

        int[] v = countVowels(text);

        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Digits: " + digits + ", Letters: " + letters);
        System.out.println("Longest word: " + longest);
        System.out.println("Vowel freq: a=" + v[0] + " e=" + v[1] +
                " i=" + v[2] + " o=" + v[3] + " u=" + v[4]);
    }
}
