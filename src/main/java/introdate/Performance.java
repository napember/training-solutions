package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private LocalDate dateOfPerformance;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalDate getDateOfPerformance() {
        return dateOfPerformance;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Performance(LocalDate dateOfPerformance, String artist, LocalTime startTime, LocalTime endTime) {
        this.dateOfPerformance = dateOfPerformance;
        this.artist = artist;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getInfo() {
        String info;
        info = artist + ": " + dateOfPerformance + " ";
        info += startTime.getHour() + ":" + startTime.getMinute() + " - ";
        info += endTime.getHour() + ":" + endTime.getMinute();

        return info;
    }
}
