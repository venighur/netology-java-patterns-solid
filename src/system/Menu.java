package system;

public class Menu {
    public static void mainActions() {
        System.out.println("Выберите действие:");
        System.out.println("1-Посмотреть список товаров");
        System.out.println("2-Посмотреть корзину");
        System.out.println("3-Посмотреть список заказов");
        System.out.println("0-Выйти");
    }

    public static void storageActions(boolean isEmpty) {
        System.out.println("Выберите действие:");
        if (!isEmpty) System.out.println("4-Добавить торвар в корзину");
        System.out.println("2-Посмотреть корзину");
        System.out.println("3-Посмотреть список заказов");
        System.out.println("0-Выйти");
    }

    public static void cartActions(boolean isEmpty) {
        System.out.println("Выберите действие:");
        if (!isEmpty) System.out.println("5-Оформить заказ");
        System.out.println("1-Посмотреть список товаров");
        System.out.println("3-Посмотреть список заказов");
        System.out.println("0-Выйти");
    }

    public static void orderActions(boolean isEmpty) {
        System.out.println("Выберите действие:");
        if (!isEmpty) System.out.println("6-Посмотреть список товаров в заказе");
        System.out.println("1-Посмотреть список товаров");
        System.out.println("2-Посмотреть корзину");
        System.out.println("0-Выйти");
    }
}
