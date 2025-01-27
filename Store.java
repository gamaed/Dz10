import java.util.ArrayList;
import java.util.List;
class Store {
    private String name;
    private List<Product> products;

    // Конструктор
    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Метод додавання продукту
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " добавил в  магазин.");
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
        System.out.println("Продукт із ID " + productId + " взял и удалил з магазину.");
    }

    // Метод виведення списку продуктів
    public void listProducts() {
        System.out.println("Список продуктів  " + name + ":");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
