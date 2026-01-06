package day4;

class IDGenerator {

    private static int next = 1000;

    public static int nextId() {
        return next++;
    }
}

class User {

    private final int id;
    private String name;

    public User(String name) {
        this.name = name;
        this.id = IDGenerator.nextId();
    }

    public int getId() {
        return id;
    }
}

public class Question90 {

    public static void main(String[] args) {

        User u1 = new User("A");
        User u2 = new User("B");

        System.out.println(u1.getId()); // 1000
        System.out.println(u2.getId()); // 1001
    }
}
