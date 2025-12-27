package day2;

public class Question2 {
	 public static void main(String[] args) {

	        int[] arr = {10, -9, 25, 7, 0};

	        int min = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println(min);
	    }

}
