package Ex011;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner te = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.println("Enter quantity of shapes: ");
        int quantity = te.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Shape #" + (i + 1));
            System.out.println("Color: ");
            String color = te.next();
            System.out.println("Circle or rectangle? (c, r)");
            char type = te.next().charAt(0);

            if (type == 'c') {
                System.out.println("Radius: ");
                double radius = te.nextDouble();

                shapes.add(new Circle(Color.valueOf(color), radius));
            } else if (type == 'r') {
                System.out.println("Width: ");
                double width = te.nextDouble();

                System.out.println("Height: ");
                double heigth = te.nextDouble();

                shapes.add(new Rectangle(Color.valueOf(color), heigth, width));
            }
        }

        for (Shape s : shapes) {
            System.out.printf("Area: %.2f \n", s.area());
        }
    }
}
