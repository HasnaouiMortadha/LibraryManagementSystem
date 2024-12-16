public class Borrower {
    private String name;
    private String email;
    private String borrowerId;

    public Borrower(String name, String email, String borrowerId) {
        this.name = name;
        this.email = email;
        this.borrowerId = borrowerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    @Override
    public String toString() {
        return "Borrower [Name: " + name + ", Email: " + email + ", Borrower ID: " + borrowerId + "]";
    }
}
