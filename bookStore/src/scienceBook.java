import java.time.LocalDate;

public class scienceBook extends Book {
    private String type;

    public scienceBook(String type) {
        this.type = type;
    }

    public scienceBook() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public scienceBook(String name, int quantity, double price, LocalDate nsx, String type) {
        super(name, quantity, price, nsx);
        this.type = type;
    }

    @Override
    public String toString() {
        return "scienceBook{"+super.toString()+" "+
                "type='" + type + '\'' +
                '}'+'\n';
    }
}
