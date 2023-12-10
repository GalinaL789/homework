package de.ait.classwork1012;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class CinemaHall {
    private int hallNumber;
    private List<Movie> moviesSchedule;

    public CinemaHall(int hallNumber) {
        this.hallNumber = hallNumber;
        this.moviesSchedule = new ArrayList<>();
    }
    public void addMovie(Movie movie) {
        for (Movie scheduledMovie : moviesSchedule) {
            if (scheduledMovie.isTimeConflict(movie)) {
                throw new ScheduleConflictException("Schedule conflict for movie: " + movie.getTitle());
            }
        }
        moviesSchedule.add(movie);
    }

    public boolean isScheduleConflict(LocalDateTime newMovieStart, LocalDateTime newMovieEnd) {
        if (newMovieStart.isAfter(newMovieEnd)) {
            throw new IllegalArgumentException("Invalid movie timing: Start time is after end time");
        }

        Movie newMovie = new Movie("Temporary Movie", newMovieStart, newMovieEnd);

        for (Movie scheduledMovie : moviesSchedule) {
            if (scheduledMovie.isTimeConflict(newMovie)) {
                return true;
            }
        }
        return false;
    }

    public void bookTicket(String movieTitle, int numberOfTickets) {
        for (Movie movie : moviesSchedule) {
            if (movie.getTitle().equals(movieTitle)) {
                // Предположим, что у фильма есть ограниченное количество мест
                // и их количество можно получить через дополнительный метод getAvailableSeats()
                int availableSeats = getAvailableSeats(movie);
                if (availableSeats >= numberOfTickets) {
                    // Забронировать билеты
                    // ...
                    return;
                } else {
                    throw new SoldOutException("No available seats for movie: " + movieTitle);
                }
            }
        }
        throw new IllegalArgumentException("Movie not found: " + movieTitle);
    }

    private int getAvailableSeats(Movie movie) {
        // Предположим, что у фильма есть ограниченное количество мест
        // и их количество можно получить через дополнительный метод getAvailableSeats()
        // ...
        return 50; // Пример, замените на реальное количество мест
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public List<Movie> getMoviesSchedule() {
        return moviesSchedule;
    }
}
