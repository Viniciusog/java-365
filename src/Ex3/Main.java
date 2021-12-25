package Ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner te = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Order o = new Order();

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String cName = te.next();
        System.out.println("E-mail: ");
        String cEmail = te.next();
        System.out.println("Birth date: (dd/MM/yyyy)");
        Date birthDate = sdf.parse(te.next());

        Client c = new Client(cName, cEmail, birthDate);
        o.setClient(c);

        System.out.println("----------ENTER ORDER DATA----------");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(te.next());
        o.setStatus(status);

        System.out.println("How many items to this order?");
        int quantityItems = te.nextInt();

        for (int i = 0; i < quantityItems; i++) {
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.println("Product name: ");
            String productName = te.next();
            System.out.println("Product price: ");
            Double price = te.nextDouble();
            System.out.println("Quantity: ");
            int quantity = te.nextInt();

            Product p = new Product(productName, price);
            OrderItem item = new OrderItem(price, quantity, p);

            o.addItem(item);
        }

        System.out.println(o);
    }
}