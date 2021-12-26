package Ex009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner te = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the quantity of products: ");
        int quantity  = te.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter product #" + ( i + 1) + " data");

            System.out.println("Name: ");
            String name = te.next();

            System.out.println("Price: ");
            double price = te.nextDouble();

            System.out.println("Imported, used or just normal product? (i/u/p)");
            char type = te.next().charAt(0);

            // imported
            if (type == 'i') {
                System.out.println("Customs fee: ");
                double customFee = te.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            }
            // used
            else if (type == 'u') {
                System.out.println("Manufactured date: (dd/MM/yyyy)");
                Date manufacturedDate = sdf.parse(te.next());
                products.add(new UsedProduct(name, price, manufacturedDate));
            }
            // normal product
            else {
                products.add(new Product(name, price));
            }
        }

        for (Product p : products) {
            System.out.println(p.getName() + " - priceTag: $ " + p.priceTag());
        }
    }
}
