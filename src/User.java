import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int userNumber;
    private List<Book> borrowedBooks;

    // Constructor til at initialisere User objektet med navn og brugernummer. Laver en tom liste til lånte bøger.
    public User(String name, int userNumber) {
        this.name = name;
        this.userNumber = userNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Henter brugerens navn.
    public String getName() {
        return name;
    }

    // Henter brugerens nummer.
    public int getUserNumber() {
        return userNumber;
    }

    // Henter listen af lånte bøger.
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Returnerer en streng med brugerens nummer og navn.
    @Override
    public String toString() {
        return "Number: " + userNumber + ", name: " + name;
    }

    // Tilføjer en bog til listen af lånte bøger og sætter bogens status til udlånt.
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowed(true);
    }

    // Fjerner en bog fra listen af lånte bøger og sætter bogens status til ikke udlånt.
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowed(false);
    }
}