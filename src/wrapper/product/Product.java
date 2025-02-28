package wrapper.product;

public abstract class Product {

    public abstract String getInfo();
    public abstract Double getCost();

    public Double getValues(){
        return getCost();
    }
    public String getNames(){
        return getInfo();
    }

}
