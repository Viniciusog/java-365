package Ex007;

// conta poupança
// Não pode ser herdada por conta de ser final
public /*final*/ class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance += this.balance * this.interestRate;
    }

    // Quando colocamos um método como sendo final, ele não poderá ser sobreescrito
    @Override
    public final void withdraw(double amount) {
        // apenas o saque da conta poupança não contém a taxa de 5 reais
        this.balance -= amount;
        // super.withdraw(amount);
    }
}
