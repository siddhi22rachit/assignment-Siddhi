package day2;

public class Question8 {
    public static void main(String[] args) {

        String str = "Java is fun and Java is powerful";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (words[i].equals("0"))
                continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            System.out.println(words[i] + ": " + count);
        }
    }
}

