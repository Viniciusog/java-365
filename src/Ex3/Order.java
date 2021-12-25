package Ex3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
        this.moment = new Date();
    }

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.client = client;
        this.status = status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                " \n moment=" + moment +
                ", \n status=" + status +
                ", \n client=" + client +
                ", \n items=" + items +
                ", \n total=" + this.total() +
                "\n }";
    }
}