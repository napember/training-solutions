package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car( "személy","benzin",5,5 );

        car.addModelName("Mazda 3");

        System.out.println(car.getCarType()+"/"+car.getEngineType()+ " doors:" + car.getDoors() + " persons:" + car.getPersons());
    }
}
