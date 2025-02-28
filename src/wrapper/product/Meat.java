package wrapper.product;

public class Meat extends Product {
    private final String name;
    private final Double price;

    public Meat(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Double getCost() {
        return price;
    }
}
