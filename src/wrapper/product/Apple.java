package wrapper.product;

public class Apple extends Product {
    private final String name;
    private final Double price;

    public Apple(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getCost() {
        return price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
