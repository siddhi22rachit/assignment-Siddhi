package day4;

class AccessDemo {

    public void publicMethod() {
        System.out.println("Public");
    }

    protected void protectedMethod() {
        System.out.println("Protected");
    }

    void defaultMethod() {
        System.out.println("Default");
    }

    private void privateMethod() {
        System.out.println("Private");
    }
}

public class Question9 {

    public static void main(String[] args) {

        AccessDemo a = new AccessDemo();
        a.publicMethod();
        a.protectedMethod();
        a.defaultMethod();
        // a.privateMethod(); // not accessible
    }
}
