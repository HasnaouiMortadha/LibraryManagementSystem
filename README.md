# Library Management System

## Project Overview
The **Library Management System** is a comprehensive desktop application designed to manage a library's key operations, such as tracking books, borrowers, and loans. This project allows librarians and administrators to efficiently add, edit, delete, and search for books, manage borrower information, and keep track of loaned items. The project showcases fundamental concepts of **object-oriented programming (OOP)**, **GUI design**, and **file management**, making it an ideal project for anyone interested in learning or demonstrating their Java development skills.

---

## Key Features

1. Book Management
   - **Add New Books**: Add books by entering details such as Title, Author, Genre, and Availability.
   - **Edit Book Details**: Update book information when required.
   - **Delete Books**: Remove books from the system permanently.
   - **Search Books**: Use the search bar to find books by title, author, or genre.

2. Borrower Management
   - **Add New Borrowers**: Store borrower details like name, contact information, and unique ID.
   - **Edit Borrower Information**: Update borrower details as needed.
   - **Delete Borrowers**: Remove borrower records from the system.

3. Loan Management
   - **Issue a Book**: Link borrowers to a book loan and track loaned books.
   - **Return a Book**: Update the system to mark a book as returned.
   - **Loan History**: View past and ongoing book loans for tracking purposes.

4. File Management
   - Data persistence through file-based storage (can be upgraded to use a database system like **MySQL** or **SQLite**).
   
5. User Interface (GUI)
   - Clean, simple, and modern graphical user interface (GUI) built using **Java Swing** or **JavaFX**.
   - Tabs for easy navigation: **Home**, **Books**, **Borrowers**, and **Loans**.
   - Functional buttons for quick actions (Add, Edit, Delete, Search) with clear, readable text.
   
6. Real-Time Notifications and Status Bar
   - **Status Bar** at the bottom indicates the connection status and operational feedback.

---

## Technologies Used

- **Programming Language**: Java (JDK 17 or higher)
- **Development Environment**: Visual Studio Code (VS Code) or IntelliJ IDEA
- **User Interface**: Java Swing or JavaFX (based on user preference)
- **File Handling**: File I/O for persistent data storage (can be expanded to support MySQL/SQLite database)
- **Version Control**: Git and GitHub for collaboration and project tracking

---

## Project Structure
```
📂 LibraryManagementSystem
 ┣ 📂 src
 ┃ ┣ 📜 Book.java         // Book class to manage book properties
 ┃ ┣ 📜 Borrower.java     // Borrower class to manage borrower information
 ┃ ┣ 📜 Loan.java         // Loan class to link borrowers with books
 ┃ ┣ 📜 FileManager.java  // Handles file I/O for data storage and retrieval
 ┃ ┣ 📜 LibrarySystem.java// Main class to initialize the system logic
 ┃ ┗ 📜 LibraryGUI.java   // GUI interface, buttons, text fields, and form design
 ┗ 📜 README.md           // Full project description, instructions, and usage guide
```
---

## Classes and Descriptions

1. Book.java
   - Represents a single book in the system.
   - Attributes: **Title**, **Author**, **Genre**, **Availability**.
   - Methods: Getters, Setters, and toString() for display.

2. Borrower.java
   - Represents a borrower who can loan books.
   - Attributes: **Name**, **Borrower ID**, **Contact Information**.
   - Methods: Getters, Setters, and toString() for display.

3. Loan.java
   - Represents the relationship between a **Book** and a **Borrower**.
   - Attributes: **Loan Date**, **Return Date**, **Status** (loaned, returned).
   - Methods: Getters, Setters, and logic to update loan status.

4. FileManager.java
   - Handles file I/O operations to read and write **books**, **borrowers**, and **loans** data.
   - Functions for **save()**, **load()**, and **update()** data from files.

5. LibrarySystem.java
   - The **main entry point** of the application.
   - Initializes the **LibraryGUI** and sets up the system logic.

6. LibraryGUI.java
   - Contains the graphical user interface (GUI) design using **Java Swing/JavaFX**.
   - Handles user input, form validation, and button click events.

---

## How to Run the Project

1. **Install Java**
   - Make sure you have **JDK 17 or higher** installed on your system.
   - Check if Java is installed by running:
     ```bash
     java -version
     javac -version
     ```

2. Install an IDE
   - Use **Visual Studio Code** or **IntelliJ IDEA**.
   - Install the **Java Extension Pack** in VS Code.

3. Clone the Repository
   ```bash
   git clone https://github.com/your-username/LibraryManagementSystem.git
   cd LibraryManagementSystem/src
   ```

4. Run the Application
   - Open the project in **VS Code** or **IntelliJ**.
   - Click the **Run button** on **LibraryGUI.java** or use the terminal command:
     ```bash
     javac LibrarySystem.java
     java LibrarySystem
     ```

---

## Usage Guide

1. Launch the Application
   - The system opens the main window with navigation tabs (**Home**, **Books**, **Borrowers**, **Loans**).

2. Manage Books
   - Navigate to the **Books** tab.
   - Use the **Add Book** button to fill in book details.
   - Edit or Delete books as needed.
   - Use the search bar to find specific books.

3. Manage Borrowers
   - Go to the **Borrowers** tab.
   - Add, Edit, or Delete borrower details.

4. Manage Loans
   - Go to the **Loans** tab.
   - Issue a loan by selecting a **Book** and **Borrower**.
   - Mark loans as **returned** when books are returned.

---

## Possible Enhancements
- **Database Integration**: Replace file-based storage with a MySQL or SQLite database.
- **User Authentication**: Add a login system for admin users.
- **Reports and Analytics**: Generate reports on borrowed books and frequent borrowers.
- **Notifications**: Notify borrowers of due dates via email.
- **Advanced UI**: Use **JavaFX** for a more modern, responsive interface.

---

## Contributing

1. Fork the Repository
2. Create a Feature Branch
   ```bash
   git checkout -b feature-name
   ```
3. Make Changes
4. Commit Changes
   ```bash
   git add .
   git commit -m 'Add new feature'
   ```
5. Push to GitHub
   ```bash
   git push origin feature-name
   ```
6. Create a Pull Request

---

## Contact
If you have any questions or suggestions, please feel free to open an **issue** or **pull request**. I would love to hear from you!

---

This project is a fantastic example of a complete, functional system that highlights key software development concepts, including **OOP**, **file handling**, **GUI design**, and **version control**. Feel free to **fork this project**, make your modifications, and showcase it in your portfolio!

Happy Coding! 🚀

