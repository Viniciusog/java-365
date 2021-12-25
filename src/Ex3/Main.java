package Ex3;

import java.time.Instant;
import java.util.Date;


public class Main {
    public static void main(String[] args) {


        Client c = new Client("Fernando", "fernando@gmail.com", Date.from(Instant.parse("1998-01-20T15:42:07Z")));
        Order order = new Order(OrderStatus.PENDING_PAYMENT, c);

        Product p = new Product("Computer", 3000D);
        Product p2 = new Product("TV", 1000D);

        //discount
        OrderItem oi = new OrderItem(2500D, 2, p);
        OrderItem oi2 = new OrderItem(1000D, 5, p2);

        order.addItem(oi);
        order.addItem(oi2);

        System.out.println(order);
    }
}