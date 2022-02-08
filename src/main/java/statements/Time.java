package statements;

public class Time {

    private int minutes;
    private int seconds;
    private int hours;

    public Time(int minutes, int seconds, int hours) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
    }

    public int getInMinutes(){
        return this.minutes + this.hours*60;
    }

    public int getInSeconds() {
        return this.seconds + 60*this.minutes+60*60*this.hours;
    }

    public boolean earlierThan( Time time) {
        return this.getInSeconds() < time.getInSeconds();
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
