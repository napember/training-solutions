package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        Position p1 = Position.CEO;
        System.out.println(p1);

        System.out.println(p1.ordinal() + ". " + p1.name()+ " " + p1.getSalery() + " " + p1.getBenefit() );
        System.out.println();

        for( Position p: Position.values() ) {
            System.out.println(p.ordinal() + ". " + p.name()+ " " + p.getSalery() + " " + p.getBenefit() );

        }

    }
}
