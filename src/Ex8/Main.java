package Ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner te = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int number = te.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            System.out.println("Employee #" + (i + 1) + " data");
            System.out.println("Outsourced? (y/n)");
            char outsourced = te.next().charAt(0);

            System.out.println("Name: ");
            String name = te.next();

            System.out.println("Hours: ");
            int hours = te.nextInt();

            System.out.println("Value per hour: ");
            double valuePerHour = te.nextDouble();

            if (outsourced == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = te.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENT: ");
        for (Employee e : employees) {
            System.out.println(e.getName() + ", payment: $ " + e.payment());
        }
    }
}