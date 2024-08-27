package lists;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Storage implements Printable {
    private final int MAX_CAPACITY = 5; // вместимость склада
    private final List<Product> storage;

    public Storage() {
        storage = new ArrayList<>();
    }

    public List<Product> getStorage() {
        return storage;
    }

    public void addProduct(Product product) {
        if (storage.size() < MAX_CAPACITY) {
            storage.add(product);
        }
    }

    public Product getProduct(int id) {
        return storage.get(id);
    }

    @Override
    public void print() {
        System.out.println();
        if (!storage.isEmpty()) {
            System.out.println("Список товаров:");
            for (int i = 0; i < storage.size(); i++) {
                System.out.println((i + 1) + "-" + storage.get(i).toString());
            }
        } else {
            System.out.println("На складе нет товаров");
        }
        System.out.println();
    }
}
