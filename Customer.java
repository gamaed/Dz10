import java.util.ArrayList;
import java.util.List;
class Customer {
    private String name;
    private List<Product> cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println("Продукт додано до кошика: " + product);
    }

    public void removeFromCart(int productId) {
        cart.removeIf(product -> product.getId() == productId);
        System.out.println("Продукт із ID " + productId + " удалил з кошика.");
    }

    private int getId() {

        return 0;
    }

    public void checkout() {
        double total = 0;
        System.out.println("Кошик клієнта '" + name + "':");
        for (Product product : cart) {
            System.out.println(product);
            total += product.getPrice();
        }
        System.out.println("Загальна вартість: " + total);
    }

    private double getPrice() {
        return 0;
    }
}
