package wrapper.product;
import java.util.Scanner;
public class ProductProcess {
    private static Product[] products;

    public static void productRequired() {
        products = new Product[5];
        products[0] = new Apple("apple", 12.5);
        products[1] = new Water("water", 0.5);
        products[2] = new Meat("meat", 20.2);
        products[3] = new Fish("fish", 48.0);
        products[4] = new Cola("cola", 5.0);
        Integer counter = 0;
        Product[] array = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            array[counter] = products[i];
            counter++;
        }
        for (Product p : array) {
            System.out.println(p + " ");
        }
        ProductProcess.selectProduct();
    }

    public static void selectProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many you want to select:");
        Integer choice = scanner.nextInt();
        Product[] selectedProduct = new Product[choice];
        for (int i = 0; i < choice; i++) {
            System.out.print("in which product you want to select:");
            String name = scanner.next();
            Product ar = getProduct(name,products);
            selectedProduct[i] = ar;
        }
        Double tot = 0.0;
        for (int i = 0; i < selectedProduct.length; i++) {
            System.out.println(selectedProduct[i].getNames() + " - " + selectedProduct[i].getValues());
            tot += selectedProduct[i].getValues();
        }
        System.out.println(tot);
    }

    public static Product getProduct(String name, Product[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNames().equals(name)) {
                return array[i];
            }
        }
        return null;
    }
}
