import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Library library2;
    private Book knotsAndCrosses;
    private Book harryPotter;

    @Before
    public void setUp(){
        library = new Library(1);
        library2 = new Library(5);
        knotsAndCrosses = new Book("Knots and Crosses", "Ian Rankin", "Crime");
        harryPotter = new Book("Harry Potter", "J K Rowling", "Urban Fantasy");
    }

    @Test
    public void numberOfBooksInLibrary(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void addBookToLibraryEnoughSpace(){
        library.addBook(harryPotter);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void addBookToLibraryNotEnoughSpace(){
        library.addBook(knotsAndCrosses);
        library.addBook(harryPotter);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void removeBookFromLibrary(){
        library2.addBook(knotsAndCrosses);
        library.addBook(harryPotter);
        library.removeBook(knotsAndCrosses);
        assertEquals(1, library.countBooks());
    }

}
