package Ex5;

public class Main {

    public static void main(String[] args) {

        Account c = new Account(1, "Fernando", 2000.0);
        BusinessAccount ba = new BusinessAccount(2,  "Maria", 3000.0, 1000.0);

        // UPCASTING
        Account c2 = ba;
        Account c3 = new BusinessAccount(3, "Bob", 500.0, 200.0);
        Account c4 = new SavingsAccount(4, "Beatriz", 7000.0, 0.05);

        // DOWNCASTING
        BusinessAccount ba2 = (BusinessAccount) c2;

        // irá dar erro durante a execução, pois c4 é na verdade do tipo savingsAccount
        // BusinessAccount ba3 = (BusinessAccount) c4;

        // forma segura de realizar downcasting
        if (c4 instanceof BusinessAccount) {
            BusinessAccount ba4 = (BusinessAccount) c4;
            ba4.loan(6000);
            System.out.println("LOAN!");
        }

        if (c4 instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) c4;
            sa.updateBalance();
            System.out.println("Update!");
        }
    }
}
