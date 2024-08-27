package order;

import products.Product;

import java.util.List;

public class Order {
    private final int num;
    private final List<Product> products;
    private String status;

    public Order(int num, List<Product> products) {
        this.num = num;
        this.products = products;
        status = "Новый";
    }

    public int getNum() {
        return num;
    }

    public String getStatus() {
        return status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductsList() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Заказ №" + num
                + ", статус - " + status;
    }
}
