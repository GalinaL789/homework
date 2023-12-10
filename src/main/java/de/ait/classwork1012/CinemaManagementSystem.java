package de.ait.classwork1012;

import java.time.LocalDateTime;


public class CinemaManagementSystem {
    public static void main(String[] args) {
        // Пример использования классов и методов
        try {
            CinemaHall cinemaHall = new CinemaHall(1);
            // Добавление фильмов в расписание
            LocalDateTime  start1 = LocalDateTime.of(2023, 12, 10, 18, 0);
            LocalDateTime end1 = LocalDateTime.of(2023, 12, 10, 20, 0);
            Movie movie1 = new Movie("Movie 1", start1, end1);
            cinemaHall.addMovie(movie1);

            LocalDateTime start2 = LocalDateTime.of(2023, 12, 10, 21, 0);
            LocalDateTime end2 = LocalDateTime.of(2023, 12, 10, 23, 0);
            Movie movie2 = new Movie("Movie 2", start2, end2);
            cinemaHall.addMovie(movie2);

            // Попытка добавить фильм с пересекающимся временем
            LocalDateTime start3 = LocalDateTime.of(2023, 12, 10, 19, 0);
            LocalDateTime end3 = LocalDateTime.of(2023, 12, 10, 22, 0);
            Movie movie3 = new Movie("Movie 3", start3, end3);
            cinemaHall.addMovie(movie3); // выбросит исключение ScheduleConflictException

            // Бронирование билетов
            cinemaHall.bookTicket("Movie 1", 2);

        } catch (ScheduleConflictException | IllegalArgumentException | SoldOutException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
