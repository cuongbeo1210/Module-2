import java.time.LocalDate;

public class Book {
    private String name;
    private int quantity;
    private double price;
    private LocalDate nsx;
    public static double sum = 0;

    public Book() {
    }

    public Book(String name, int quantity, double price, LocalDate nsx) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.nsx = nsx;
        sum += price * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getNsx() {
        return nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    @Override
    public String toString() {
        return " Book { " +
                "name = '" + name + '\'' +
                ", quantity = " + quantity +
                ", price = " + price +
                ", nsx = " + nsx + ' ' +
                '}';
    }
}
