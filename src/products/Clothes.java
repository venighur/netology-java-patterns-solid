package products;

public class Clothes extends Product {
    private final String size;
    private final String color;

    public Clothes(String title, int price, String size, String color) {
        super(title, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Наименование: " + title +
                ", размер: " + size +
                ", цвет: " + color +
                " Цена: " + price + " руб.";
    }
}
