package day3;

public class Question6 {

    public static String compress(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int count = 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(current).append(count);
        }
        return result.toString();
    }

    public static String decompress(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "aaabbc";

        String compressed = compress(text);
        System.out.println("Compressed: " + compressed);

        String decompressed = decompress(compressed);
        System.out.println("Decompressed: " + decompressed);
    }
}
