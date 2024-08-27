package products;

public class Food extends Product {
    private final String productionDate;
    private final String expirationDate;

    public Food(String title, int price, String productionDate, String expirationDate) {
        super(title, price);
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Наименование: " + title +
                ", дата изготовления: " + productionDate +
                ", годен до: " + expirationDate +
                " Цена: " + price + " руб.";
    }
}
