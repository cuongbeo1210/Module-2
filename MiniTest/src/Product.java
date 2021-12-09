public class Product {
    private int ID;
    private String name;
    private double price;
    private String type;
    private String money;

    public Product() {
    }

    public Product(int ID, String name, double price, String type, String money) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.type = type;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", money='" + money + '\'' +
                '}';
    }

    public String getMoney() {
        return money;
    }

    public void setMoney (String money) {
        this.money = money;
    }
}
