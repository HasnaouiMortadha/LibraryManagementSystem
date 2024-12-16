import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;
    private ArrayList<Loan> loans;

    public LibrarySystem() {
        books = (ArrayList<Book>) FileManager.loadDataFromFile("data/books.txt");
        borrowers = (ArrayList<Borrower>) FileManager.loadDataFromFile("data/borrowers.txt");
        loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        FileManager.saveDataToFile("data/books.txt", books);
    }

    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
        FileManager.saveDataToFile("data/borrowers.txt", borrowers);
    }

    public void issueBook(String isbn, String borrowerId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                for (Borrower borrower : borrowers) {
                    if (borrower.getBorrowerId().equals(borrowerId)) {
                        Loan loan = new Loan(book, borrower, java.time.LocalDate.now(), java.time.LocalDate.now().plusDays(14));
                        loans.add(loan);
                        book.setAvailable(false);
                        System.out.println("Book issued successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("Could not issue book.");
    }
}
