package DesignProblems.LibraryManagementSystem;
import java.util.*;

public class LMS {

    // Book Class
    public static class Book {
        private final String id;
        private String author;
        private String title;
        private boolean isIssued;

        public Book(String id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }

        public String getId() {
            return id;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public boolean isIssued() {
            return isIssued;
        }

        public void markIssued() {
            this.isIssued = true;
        }

        public void markReturned() {
            this.isIssued = false;
        }
    }

    // Member Class
    public static class Member {
        private final String id;
        private String name;
        private List<Book> issuedBooks;

        public Member(String id, String name) {
            this.id = id;
            this.name = name;
            this.issuedBooks = new ArrayList<>();
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public boolean addIssuedBook(Book book) {
            this.issuedBooks.add(book);
            return true;
        }

        public boolean removeIssuedBook(Book book) {
            this.issuedBooks.remove(book);
            return true;
        }

        public List<Book> getIssuedBooks() {
            return issuedBooks;
        }
    }

    // Library Class
    public static class Library {
        private Map<String, Book> bookMap;
        private Map<String, Member> memberMap;

        public Library() {
            this.bookMap = new HashMap<>();
            this.memberMap = new HashMap<>();
        }

        public boolean addBook(Book book) {
            String bookId = book.getId();
            if (bookMap.containsKey(bookId)) {
                return false;  // Book already exists
            } else {
                bookMap.put(bookId, book);
                return true;
            }
        }

        public boolean addMember(Member member) {
            String memberId = member.getId();
            if (memberMap.containsKey(memberId)) {
                return false;  // Member already exists
            } else {
                memberMap.put(memberId, member);
                return true;
            }
        }

        public boolean issueBook(String bookId, String memberId) {
            if (bookMap.containsKey(bookId) && memberMap.containsKey(memberId)) {
                Book book = bookMap.get(bookId);
                Member member = memberMap.get(memberId);
                if (book.isIssued()) {
                    return false; // The book is already issued
                }
                book.markIssued();
                member.addIssuedBook(book);
                return true;
            }
            return false;
        }

        public boolean returnBook(String bookId, String memberId) {
            if (bookMap.containsKey(bookId) && memberMap.containsKey(memberId)) {
                Book book = bookMap.get(bookId);
                Member member = memberMap.get(memberId);
                if (!book.isIssued()) return false;  // Book isn't issued
                if (!member.getIssuedBooks().contains(book)) return false; // Member didn't issue this book
                book.markReturned();
                member.removeIssuedBook(book);
                return true;
            }
            return false;
        }

        public void printLibraryStatus() {
            System.out.println("Books in Library:");
            for (Book book : bookMap.values()) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Issued: " + book.isIssued());
            }

            System.out.println("\nMembers in Library:");
            for (Member member : memberMap.values()) {
                System.out.println("ID: " + member.getId() + ", Name: " + member.getName());
                System.out.println("Issued Books: ");
                for (Book book : member.getIssuedBooks()) {
                    System.out.println("  " + book.getTitle());
                }
                System.out.println();
            }
        }
    }

    // Main Class to test the Library Management System
    public static void main(String[] args) {
        // Create Library instance
        Library library = new Library();

        // Create some books
        Book book1 = new Book("B1", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B2", "1984", "George Orwell");
        Book book3 = new Book("B3", "To Kill a Mockingbird", "Harper Lee");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some members
        Member member1 = new Member("M1", "Alice");
        Member member2 = new Member("M2", "Bob");

        // Add members to the library
        library.addMember(member1);
        library.addMember(member2);

        // Print initial library status
        library.printLibraryStatus();

        // Issue books to members
        System.out.println("\nIssuing '1984' to Alice...");
        library.issueBook("B2", "M1");

        // Print updated library status
        library.printLibraryStatus();

        // Try to issue the same book again
        System.out.println("\nIssuing '1984' to Bob...");
        boolean result = library.issueBook("B2", "M2");
        if (!result) {
            System.out.println("Failed: Book '1984' is already issued to another member.");
        }

        // Return a book
        System.out.println("\nReturning '1984' from Alice...");
        library.returnBook("B2", "M1");

        // Print final library status
        library.printLibraryStatus();
    }
}


