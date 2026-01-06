package day4;

class Student {

    private final int id;
    private String name;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Question3 {

    public static void main(String[] args) {

        Student s = new Student(101);
        s.setName("Alice");

        System.out.println(s.getId());   // 101
        System.out.println(s.getName());
    }
}
