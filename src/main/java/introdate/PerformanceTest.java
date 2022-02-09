package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance(LocalDate.of(2022,6,30), "Vashegyi György", LocalTime.of(20,0),LocalTime.of(21,30));
        System.out.println( performance.getInfo());

    }
}
