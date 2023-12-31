
import java.util.ArrayList;

public class Library {

private ArrayList<Book> books;
private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.bookCount() < this.capacity){
            this.books.add(book);
    }}

    public void loanBook(Book book, Borrower borrower){
        this.books.remove(book);
        borrower.addBook(book);

    }
}
