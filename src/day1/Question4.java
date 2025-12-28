package day1;

public class Question4 {
	 public static void main(String[] args) {

	        String str = "bab!!";
	        int[] count = new int[26];

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                count[ch - 'a']++;
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            if (count[i] > 0) {
	                System.out.println((char)(i + 'a') + ":" + count[i]);
	            }
	        }
	    }

}
