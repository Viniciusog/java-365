package Ex7;

public class Main {

    public static void main(String[] args) {

        // Cada um dos tipos de contas possuem implementações específicas para o método withdraw

        Account c = new Account();
        c.deposit(1000);
        c.withdraw(300);

        Account c2 = new BusinessAccount();
        c2.deposit(1000);
        c2.withdraw(300);

        Account c3 = new SavingsAccount();
        c3.deposit(1000);
        c3.withdraw(300);

        System.out.println(c.getBalance());
        System.out.println(c2.getBalance());
        System.out.println(c3.getBalance());
    }
}
