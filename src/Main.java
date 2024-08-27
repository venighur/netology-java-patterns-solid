import lists.Cart;
import lists.Orders;
import lists.Storage;
import order.Order;
import products.Clothes;
import products.Food;
import system.Logger;
import system.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        int orderNum = 1;

        Storage storage = new Storage();
        Cart cart = Cart.getInstance();
        Orders orders = new Orders();

        storage.addProduct(new Food("Хлеб", 10, "01/08/2024", "10/08/2024"));
        storage.addProduct(new Food("Молоко", 50, "01/08/2024", "14/08/2024"));
        storage.addProduct(new Clothes("Футболка", 200, "L", "белый"));
        storage.addProduct(new Clothes("Футболка", 200, "L", "черный"));
        storage.addProduct(new Clothes("Футболка", 220, "XL", "черный"));
        // товар не будет добавлен на склад, т.к. достигнута максимальная вместимость в 5 товаров
        storage.addProduct(new Food("Сыр", 400, "07/08/2024", "16/08/2024"));

        Menu.mainActions();
        while (!finished) {
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    storage.print();
                    Menu.storageActions(storage.getStorage().isEmpty());
                    break;
                case 2:
                    cart.print();
                    Menu.cartActions(cart.getCart().isEmpty());
                    break;
                case 3:
                    orders.print();
                    Menu.orderActions(orders.getOrders().isEmpty());
                    break;
                case 4:
                    System.out.print("Введите номер товара: ");
                    int productToAddId = scanner.nextInt();
                    cart.addProduct(storage.getProduct(productToAddId - 1));
                    storage.print();
                    Menu.storageActions(storage.getStorage().isEmpty());
                    break;
                case 5:
                    Order orderToAdd = new Order(orderNum, cart.getCart());
                    orders.addOrder(orderToAdd);
                    cart.clear();
                    orderNum++;
                    orders.print();
                    Menu.orderActions(orders.getOrders().isEmpty());
                    break;
                case 6:
                    System.out.print("Введите номер заказа: ");
                    int orderToViewId = scanner.nextInt();
                    Order orderToView = orders.getOrder(orderToViewId - 1);
                    System.out.println(orderToView.getProductsList());
                    Menu.mainActions();
                    break;
                case 0:
                    finished = true;
                    break;
                default:
                    Logger.error("Выбрано недопустимое действие");
            }
        }

        scanner.close();
    }
}