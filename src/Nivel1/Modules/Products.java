package Nivel1.Modules;

public class Products {
    private String name;
    private double price;

    public Products(String name, Double precio) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
