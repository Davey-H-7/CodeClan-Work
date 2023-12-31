import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Lord of the Rings", "J.R.R Tolkien", "Fantasy");
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

}
