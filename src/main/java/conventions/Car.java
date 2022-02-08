package conventions;

public class Car {
    private int doors;
    private String carType;
    private String engineType;
    private int persons;

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getPersons() {
        return persons;
    }

    public Car(String carType, String engineType, int doors, int persons) {
        this.carType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.persons = persons;
    }

    public String getCarType() {
        return carType;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getDoors() {
        return doors;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;}

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPersonS(int persons) {
        this.persons = persons;
    }

    public void addModelName(String modelName) {
        this.carType = carType + " " + modelName;
    }
}
