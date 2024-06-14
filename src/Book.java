public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    // Constructor til at initialisere Book objektet med en titel og en forfatter. Udlånsstatus er som standard sat til false.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    // Henter bogens titel.
    public String getTitle() {
        return title;
    }

    // Henter bogens forfatter.
    public String getAuthor() {
        return author;
    }

    // Tjekker om bogen er udlånt.
    public boolean isBorrowed() {
        return borrowed;
    }

    // Sætter bogens udlånsstatus.
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // Returnerer en streng med bogens titel, forfatter og udlånsstatus.
    @Override
    public String toString() {
        return title + ", " + author + ", status: " + (borrowed ? "udlånt" : "ikke udlånt");
    }
}