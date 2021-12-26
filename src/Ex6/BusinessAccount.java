package Ex6;

public class BusinessAccount extends Account {

    // limite de empréstimo
    private Double loanLimit;

    public BusinessAccount() {
        // para caso Account tenha alguma lógica implementada no construtor
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    // empréstimo
    public void loan(double amount) {
        if (amount <= loanLimit) {
            // por enquanto apenas depoisita o valor na conta
            balance += amount - 10; // 10 de taxa
        }
    }

    @Override
    public void withdraw(double amount) {
        // executa o withdraw da superclasse e desconta mais 2 do saldo geral da conta empresarial
        super.withdraw(amount);
        this.balance -= 2;
    }
}
