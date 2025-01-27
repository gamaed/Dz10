//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Пиво", 60.5);
        Product product2 = new Product(2, "Рыбка", 45.0);
        Product product3 = new Product(3, "Огручик", 9.2);
        Store store = new Store("Магазин Гали");
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.listProducts();
        Customer customer = new Customer("Іван");
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.checkout();
        customer.removeFromCart(1);
        customer.checkout();
        store.removeProduct(2);
        store.listProducts();
    }
}