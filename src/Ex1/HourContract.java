package Ex1;

import java.util.Date;

public class HourContract {

    private Date date;
    private Integer hours;
    private Double valuePerHour;

    public HourContract() {

    }

    public HourContract(Date date, Integer hours, Double valuePerHour) {
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalValue() {
        return hours * valuePerHour;
    }
}
