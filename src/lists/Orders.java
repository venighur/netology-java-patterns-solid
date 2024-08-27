package lists;

import order.Order;
import system.Logger;

import java.util.ArrayList;
import java.util.List;

public class Orders implements Printable {
    private final List<Order> orders;

    public Orders() {
        orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
        Logger.info("Заказ оформлен");
    }

    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

    @Override
    public void print() {
        System.out.println();
        if (!orders.isEmpty()) {
            System.out.println("Список заказов:");
            for (int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + "-" + orders.get(i).toString());
            }
        } else {
            System.out.println("Нет оформленых заказов");
        }
        System.out.println();
    }
}
