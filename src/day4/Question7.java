package day4;

class Counter {

    private int value = 0;
    public static int instances = 0;

    public Counter() {
        instances++;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}

public class Question7 {

    public static void main(String[] args) {

        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();

        System.out.println(Counter.instances); // 3
    }
}
