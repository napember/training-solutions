package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = { "Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap" };
        System.out.print(week[1] + " ");
        System.out.println(week.length );


        int[] power = new int[5];

        power[0] = 1;
        for(int i=1; i < power.length; i++) {
            power[i] = power[i-1]*2;
        }

        for( int i:power) {
            System.out.print( i + " ");
        }
        System.out.println();


        boolean[] arrayBool = new boolean[6];

        arrayBool[0] = false;
        for( int i = 1; i< arrayBool.length; i++) {
            arrayBool[i] = !arrayBool[i-1];
        }

        for ( boolean i:arrayBool) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayHandler ah = new ArrayHandler();

        ah.addIndexToNumber(power);
        for( int i:power) {
            System.out.print( i + " ");
        }
        System.out.println();

        ah.concatenateIndexToWord(week);
        for( String i:week) {
            System.out.print( i + "; ");
        }


    }


}
