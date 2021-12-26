package Ex003;

public class OrderItem {

    private Double price;
    private Integer quantity;
    private Product product;

    public OrderItem(Double price, Integer quantity, Product product) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return this.getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", product=" + product +
                ", subTotal=" + this.subTotal() +
                '}';
    }
}
