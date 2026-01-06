package day4;

class Rectangle {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        if (w > 0) {
            width = w;
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        }
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

public class Question2 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setHeight(5);

        System.out.println(r.area());      // 50.0
        System.out.println(r.perimeter()); // 30.0

        r.setWidth(0); // rejected
    }
}
