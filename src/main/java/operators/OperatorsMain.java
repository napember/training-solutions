package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(15));
        System.out.println(15 >> 1);
        System.out.println(Integer.toBinaryString(15 >> 1));

        System.out.println(15 << 1);
        System.out.println(Integer.toBinaryString(15 << 1));

        Operators op = new Operators();


        System.out.println( "5: "+(op.isEven(5)?"páros":"páratlan"));
        System.out.println( "50: "+(op.isEven(50)?"páros":"páratlan"));
        System.out.println(op.getResultOfDivision(16,3));
    }
}
