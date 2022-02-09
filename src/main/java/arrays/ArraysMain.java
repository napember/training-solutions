package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        double[] day1 = { 12.0,13.0,14.0,16.0,18,0,20.0};
        double[] day2 = { 12.0,13.0,14.0,16.0,18,0,20.1};

        System.out.println( Arrays.equals(day1,day2)? "azonos": "Különböző"  );

        System.out.println( Arrays.toString(day1));
        System.out.println( Arrays.toString(day2));
    }

}
