package lists;

import products.Product;
import system.Logger;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Printable {
    private static Cart instance = null;
    private List<Product> cart;

    private Cart() {
        cart = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) instance = new Cart();
        return instance;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void addProduct(Product product) {
        if (!cart.contains(product)) {
            cart.add(product);
            Logger.info("Товар добавлен в корзину");
        } else {
            Logger.info("Этот товар уже есть в корзине");
        }
    }

    public void clear() {
        cart = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println();
        if (!cart.isEmpty()) {
            System.out.println("Корзина:");
            for (Product product : cart) {
                System.out.println(product.toString());
            }
        } else {
            System.out.println("Корзина пуста!");
        }
        System.out.println();
    }
}
