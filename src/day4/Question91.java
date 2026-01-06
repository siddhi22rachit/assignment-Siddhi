package day4;

class LibraryBook {

    private String title;
    private String author;
    private boolean issued = false;

    public static int totalBooks = 0;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Already issued");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned");
        } else {
            System.out.println("Book was not issued");
        }
    }

    public boolean isIssued() {
        return issued;
    }
}

public class Question91 {

    public static void main(String[] args) {

        LibraryBook b = new LibraryBook("1984", "Orwell");
        b.issue();
        b.issue();
        b.returnBook();

        System.out.println("Total Books: " + LibraryBook.totalBooks);
    }
}
