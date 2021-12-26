package Ex007;

// Erro: Não pode herdar de classe 'final'
public class SavingsAccountPlus extends SavingsAccount {

    // não pode sobreescrever método final definido pela superclasse
    /*@Override
    public void withdraw(double amount) {
        this.balance -= amount + 2;
    }*/
}
