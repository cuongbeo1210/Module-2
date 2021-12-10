import java.time.LocalDate;

public class novelBook extends Book {
    private String author;

    public novelBook(String author) {
        this.author = author;
    }

    public novelBook(String name, int quantity, double price, LocalDate nsx, String author) {
        super(name, quantity, price, nsx);
        this.author = author;
    }

    public novelBook() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
