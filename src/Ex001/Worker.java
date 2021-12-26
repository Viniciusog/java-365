package Ex001;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private Double baseSalary;
    private WorkerLevel level;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {

    }

    public Worker(String name, Double baseSalary, WorkerLevel level, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract hourContract) {
        this.contracts.add(hourContract);
    }

    public void removeContract(HourContract hourContract) {
        this.contracts.remove(hourContract);
    }

    public double yearIncome(Integer year, Integer month) {
        double income = baseSalary;
        Calendar cal = Calendar.getInstance();

        for (HourContract hc : contracts) {
            cal.setTime(hc.getDate());
            if (cal.get(Calendar.YEAR) == year && cal.get(Calendar.MONTH) + 1 == month) {
                income += hc.totalValue();
            }
        }
        return income;
    }
}