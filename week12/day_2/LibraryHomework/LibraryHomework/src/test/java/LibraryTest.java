import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;

    public Borrower borrower;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("Friends Like These", "Danny Wallace", "Comedy");
        borrower = new Borrower();
    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBooksIfCapacityFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canLoanBooks() {
        library.loanBook(book, borrower);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }
}
