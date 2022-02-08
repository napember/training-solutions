package localvariables;

public class Distance {

    private double distanceInKm;
    private boolean isExact;

    public double getDistance() {
        return distanceInKm;
    }

    public boolean isExact() {
        return isExact;
    }

    public Distance(double distance, boolean isExact) {
        this.distanceInKm = distance;
        this.isExact = isExact;
    }
}
