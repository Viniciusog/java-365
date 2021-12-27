package Ex012;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double yearIncome, Double healthExpenditures) {
        super(name, yearIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double value = 0;
        if (this.anualIncome < 20000) {
            value = this.anualIncome * 0.15;
        } else {
            value = this.anualIncome * 0.25;
        }

        value = healthExpenditures > 0 ? value - (0.5 * healthExpenditures) : value;

        // Se o valor de imposto que deve ser pago for negativo, então retorna zero
        return value > 0 ? value : 0;
    }
}
