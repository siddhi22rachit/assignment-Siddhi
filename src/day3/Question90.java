package day3;

public class Question90 {

    static String[] names = new String[100];
    static String[] phones = new String[100];
    static int count = 0;

    public static void add(String name, String phone) {
        if (phone.length() != 10) {
            System.out.println("Invalid phone number");
            return;
        }

        for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Invalid phone number");
                return;
            }
        }

        names[count] = name;
        phones[count] = phone;
        count++;
    }

    public static void delete(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    phones[j] = phones[j + 1];
                }
                count--;
                System.out.println("Deleted: " + name);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void find(String key) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (names[i].toLowerCase().contains(key.toLowerCase())) {
                System.out.println("Found: " + names[i] + "(" + phones[i] + ")");
                found = true;
            }
        }
        if (!found) System.out.println("No match found");
    }

    public static void list() {
        for (int i = 0; i < count; i++) {
            System.out.print(names[i] + "(" + phones[i] + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        add("Alice", "9876543210");
        add("Bob", "9123456789");

        find("li");
        list();

        delete("Bob");
        list();

        System.out.println("Goodbye.");
    }
}
