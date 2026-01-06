package day4;

class Vector2D {

    private final double x;
    private final double y;

    public static final Vector2D ZERO = new Vector2D(0, 0);
    public static final Vector2D UNIT_X = new Vector2D(1, 0);
    public static final Vector2D UNIT_Y = new Vector2D(0, 1);

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Vector2D fromPolar(double r, double theta) {
        return new Vector2D(r * Math.cos(theta), r * Math.sin(theta));
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    public Vector2D scale(double s) {
        return new Vector2D(this.x * s, this.y * s);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }
}

public class Question92 {

    public static void main(String[] args) {

        Vector2D v = Vector2D.fromPolar(2, Math.PI / 2);
        Vector2D w = Vector2D.UNIT_X.add(v);

        System.out.println(w.magnitude());
    }
}
