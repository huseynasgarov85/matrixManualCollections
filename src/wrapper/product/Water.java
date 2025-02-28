package wrapper.product;

public class Water extends Product {
    private final String name;
    private final Double price;
    public Water(String name, Double price) {
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
