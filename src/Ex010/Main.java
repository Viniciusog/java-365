package Ex010;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Cada um dos tipos de contas possuem implementações específicas para o método withdraw
        List<Account> accounts = new ArrayList<>();

        accounts.add(new BusinessAccount(1, "Fernando", 1000.0, 500.0));
        accounts.add(new BusinessAccount(2, "Fernando", 2000.0, 500.0));
        accounts.add(new SavingsAccount(3, "Fernando", 1000.0, 0.05));
        accounts.add(new BusinessAccount(4, "Fernando", 500.0, 0.01));

        // calcular o total de todas as contas
        double total = 0;
        for (Account a : accounts) {
            total += a.getBalance();
        }

        System.out.println("Total balance: " + total);

        // adicionar 10 no balanço de todas as contas
        for (Account a : accounts) {
            a.deposit(10);
            System.out.printf("Updated balance for account %d: %.2f \n", a.getNumber(), a.getBalance());
        }
    }
}
