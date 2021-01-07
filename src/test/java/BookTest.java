import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book("Knots and Crosses", "Ian Rankin", "Historical Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Knots and Crosses", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ian Rankin", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Crime", book.getGenre());
    }
}
