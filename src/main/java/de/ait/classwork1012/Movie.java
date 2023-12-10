package de.ait.classwork1012;

//import java.time.LocalTime;
import java.time.LocalDateTime;
public class Movie {
    private String title;
    private LocalDateTime starttime;
    private LocalDateTime endtime;

    public Movie(String title, LocalDateTime starttime, LocalDateTime endtime) {
        this.title = title;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }
    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }
    public boolean isTimeConflict(Movie other) {
        return !(this.endtime.isBefore(other.starttime) || this.starttime.isAfter(other.endtime));
    }
}
