package Ex1;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Worker w = new Worker("Felipe", 1000D, WorkerLevel.MID_LEVEL, new Department("Comunicação"));

        Date d1 = Date.from(Instant.parse("2021-01-20T15:42:07Z"));
        Date d2 = Date.from(Instant.parse("2021-02-25T13:47:03Z"));
        Date d3 = Date.from(Instant.parse("2021-03-15T11:46:02Z"));

        w.addContract(new HourContract(new Date(), 10, 20D));
        w.addContract(new HourContract(d1, 30, 20D));
        w.addContract(new HourContract(d2, 10, 15D));
        w.addContract(new HourContract(d3, 25, 4D));


        System.out.println("Total value - january: " + w.yearIncome(2021, 1));
        System.out.println("Total value - february: " + w.yearIncome(2021, 2));
        System.out.println("Total value - march: " + w.yearIncome(2021, 3));
        System.out.println("Total value - december: " + w.yearIncome(2021, 12));
    }
}
