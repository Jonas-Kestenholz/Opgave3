public class Main {
    public static void main(String[] args) {
        // Opret bøger
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Opret bibliotek og tilføj bøger
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        // Opret bruger
        User user1 = new User("Alice", 1);

        //user1.borrowBook(book1);
        library.borrowBook(0, user1);
        library.borrowBook(1, user1);
        System.out.println(user1.getBorrowedBooks());

    }
}



















/*

// I STEDET FOR I index, book book
// skal ændre i sout
// skal være korrekt bog den prompter i konsollen
// fyld souts væk fra main
// simplere borrow metoder
*/