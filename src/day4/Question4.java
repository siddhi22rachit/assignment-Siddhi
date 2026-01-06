package day4;

class MathUtil {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int clamp(int v, int min, int max) {
        if (v < min) return min;
        if (v > max) return max;
        return v;
    }
}

public class Question4 {

    public static void main(String[] args) {

        System.out.println(MathUtil.max(7, 3));        // 7
        System.out.println(MathUtil.clamp(15, 0, 10)); // 10
        System.out.println(MathUtil.clamp(-3, -2, 5)); // -2
    }
}
