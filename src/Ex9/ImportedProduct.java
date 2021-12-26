package Ex9;

public class ImportedProduct extends Product {

    private Double customsFe;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFe) {
        super(name, price);
        this.customsFe = customsFe;
    }

    public Double getCustomsFe() {
        return customsFe;
    }

    public void setCustomsFe(Double customsFe) {
        this.customsFe = customsFe;
    }

    @Override
    public Double priceTag() {
        return super.priceTag() + customsFe;
    }

    public Double totalPrice() {
        return this.getPrice() + customsFe;
    }
}
