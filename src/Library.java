import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    // Constructor til at initialisere Library objektet med en tom liste af bøger.
    public Library() {
        this.books = new ArrayList<>();
    }

    // Tilføjer en bog til bibliotekets liste af bøger.
    public void addBook(Book book) {
        books.add(book);
    }

    // Låner en bog fra biblioteket til en bruger, hvis bogen ikke allerede er udlånt.
    // Returnerer true, hvis udlånet var succesfuldt, ellers false.
    public boolean borrowBook(int index, User user) {
        if (index >= 0 && index < books.size()) { // Tjekker om index er gyldigt.
            Book book = books.get(index);
            if (!book.isBorrowed()) { // Tjekker om bogen ikke allerede er udlånt.
                user.borrowBook(book); // Låner bogen til brugeren.
                return true;
            }
        }
            return false; // Returnerer false, hvis udlånet ikke var muligt.
        }

        // Returnerer en bog til biblioteket fra en bruger, hvis bogen er lånt af brugeren.
        // Returnerer true, hvis tilbageleveringen var succesfuldt, ellers false.
    public boolean returnBook (Book book, User user){
            if (user.getBorrowedBooks().contains(book)) { // Tjekker om brugeren har lånt bogen.
                user.returnBook(book); // Returnerer bogen til biblioteket.
                return true;
            }
            return false; // Returnerer false, hvis tilbageleveringen ikke var mulig.
        }

        // Henter bibliotekets liste af bøger.
    public List<Book> getBooks () {
            return books;
        }
    }

