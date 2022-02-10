package enumtype.position;

public enum Position {
    CEO(1000000,"exchange"),VICE_DIRECTOR(800000,"auto"),ADMIN(400000,"food");

    private final int salery;
    private final String benefit;

    Position(int salery, String benefit) {
        this.salery = salery;
        this.benefit = benefit;
    }

    public int getSalery() {
        return salery;
    }

    public String getBenefit() {
        return benefit;
    }

    @Override
    public String toString() {
        return "Position{" +
                "salery=" + salery +
                ", benefit='" + benefit + '\'' +
                '}';
    }
}
