import java.time.LocalDate;

public class Loan {
    private Book book;
    private Borrower borrower;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Loan(Book book, Borrower borrower, LocalDate issueDate, LocalDate dueDate) {
        this.book = book;
        this.borrower = borrower;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Loan [Book: " + book.getTitle() + ", Borrower: " + borrower.getName() +
                ", Issued On: " + issueDate + ", Due Date: " + dueDate + "]";
    }
}
