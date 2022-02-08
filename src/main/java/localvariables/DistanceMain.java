package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(10.9,false);

        System.out.println("Dist: " + distance.getDistance() + " exact:" + distance.isExact());

        int i = (int)distance.getDistance();

        System.out.println("Dist int: " + i);
    }
}
