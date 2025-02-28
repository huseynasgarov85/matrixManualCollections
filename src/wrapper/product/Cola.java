package wrapper.product;

public class Cola extends Product{
    private final String name;
    private final Double price;

    public Cola(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return name;
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
}
