package Ex007;

public class Account {

    private Integer number;
    private String holder;
    protected double balance; // total na conta

    public Account() {

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    // saque contém uma taxa de 5 reais
    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    // deposito
    public void deposit(double amount) {
        this.balance += amount;
    }
}