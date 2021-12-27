package Ex012;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner te = new Scanner(System.in);

        System.out.println("Enter number of people: ");
        int numberOfPeople = te.nextInt();

        List<TaxPayer> taxList = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person #" + (i+1));
            System.out.println("Name: ");
            String name = te.next();
            System.out.println("Anual income: ");
            double anualIncome = te.nextDouble();

            System.out.println("Natural person or legal person? (n, l)");
            char type = te.next().charAt(0);

            if (type == 'n') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = te.nextDouble();

                taxList.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (type == 'l') {
                System.out.println("Number of employees: ");
                int numberOfEmployees = te.nextInt();

                taxList.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        for (TaxPayer p : taxList) {
            System.out.printf("%s - Tax: %.2f\n", p.getName(), p.tax());
        }
    }
}
