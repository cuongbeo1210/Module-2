package product_manage;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String brand;
    private double manufacturer;
    private String type;

    public Product() {
    }

    public Product(int id, String name, String brand, double manufacturer, String type) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(double manufacturer) {
        this.manufacturer = manufacturer;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", manufacturer=" + manufacturer +
                ", type='" + type + '\'' +
                '}';
    }
}
