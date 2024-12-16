import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI {
    private JFrame frame;
    private LibrarySystem system;

    public LibraryGUI() {
        system = new LibrarySystem();
        frame = new JFrame("Library Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addBookButton = new JButton("Add Book");
        addBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = JOptionPane.showInputDialog("Enter book title:");
                String author = JOptionPane.showInputDialog("Enter book author:");
                String isbn = JOptionPane.showInputDialog("Enter book ISBN:");
                system.addBook(new Book(title, author, isbn));
                JOptionPane.showMessageDialog(frame, "Book added successfully!");
            }
        });

        frame.add(addBookButton);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LibraryGUI();
    }
}
