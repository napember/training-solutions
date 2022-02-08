package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Time time1 = new Time(0,0,0);
        Time time2 = new Time(0,0,0);
        getTime(time1);
        getTime(time2);
        System.out.println("Első időpont " + time1 +" = " + time1.getInMinutes() );
        System.out.println("Második időpont " + time2 +" = " + time2.getInSeconds() );

        System.out.println("Az első korábbi mint a második: " + time1.earlierThan(time2) );

    }

    private static void getTime(Time time){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Óra: ");
        time.setHours( scanner.nextInt());
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.println("Perc: ");
        time.setMinutes( scanner.nextInt());
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        System.out.println("Másodperc: ");
        time.setSeconds( scanner.nextInt());
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

    }
}
