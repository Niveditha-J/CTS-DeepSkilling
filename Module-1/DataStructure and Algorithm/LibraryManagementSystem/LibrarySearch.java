package LibraryManagementSystem;

// LibrarySearch.java
import java.util.*;

public class LibrarySearch {

    // Linear search by title
    public static Book linearSearchByTitle(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title (assumes books are sorted by title)
    public static Book binarySearchByTitle(Book[] books, String searchTitle) {
        int low = 0, high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = books[mid].title.compareToIgnoreCase(searchTitle);

            if (compare == 0) return books[mid];
            else if (compare < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "Harry Potter", "J.K. Rowling")
        };

        // Sort for binary search
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        System.out.println("Linear Search for '1984':");
        Book found1 = linearSearchByTitle(books, "1984");
        if (found1 != null) found1.display();
        else System.out.println("Book not found.");

        System.out.println("\nBinary Search for '1984':");
        Book found2 = binarySearchByTitle(books, "1984");
        if (found2 != null) found2.display();
        else System.out.println("Book not found.");
    }
}

