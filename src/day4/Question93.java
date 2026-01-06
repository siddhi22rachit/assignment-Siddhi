package day4;

class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public void setSalary(double s) {
        if (s < 10000 || s > 500000) {
            System.out.println("Invalid salary");
            return;
        }
        salary = s;
    }

    public void raise(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid raise");
            return;
        }
        salary += salary * percent / 100;
    }

    public double getSalary() {
        return salary;
    }
}

public class Question93 {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("");
        e.setSalary(9000);
        e.setSalary(120000);
        e.raise(10);
        e.raise(200);

        System.out.println(e.getSalary());
    }
}
