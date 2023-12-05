package de.ait.homework54;
import java.util.List;
import java.time.LocalDateTime;

public class EventSchedulerExample {
    public static void main(String[] args) {
        EventScheduler scheduler = new EventScheduler();

        // Создаем события
        Event event1 = new Event("International Conference", LocalDateTime.of(2023, 12, 25, 14, 0),
                LocalDateTime.of(2023, 12, 30, 15, 30));
        Event event2 = new Event("Internal Seminar", LocalDateTime.of(2023, 12, 26, 14, 0),
                LocalDateTime.of(2023, 12, 28, 17, 0));
        Event event3 = new Event("Корпаратив", LocalDateTime.of(2023, 12, 7, 18, 45),
                LocalDateTime.of(2023, 12, 7, 21, 30));

        // Добавляем события в планировщик
        scheduler.addEvent(event1);
        scheduler.addEvent(event2);
        scheduler.addEvent(event3);

        // Получаем все события
        List<Event> allEvents = scheduler.getAllEvents();
        System.out.println("Все события:");
        for (Event event : allEvents) {
            System.out.println(event.getName() + " " + event.getStartDateTime() + " - " + event.getEndDateTime());
        }

        // Получаем события на конкретную дату
        LocalDateTime targetDate = LocalDateTime.of(2023, 12, 26, 15, 0);
        List<Event> eventsOnDate = scheduler.getEventsOnDate(targetDate);
        System.out.println("\nСобытия на " + targetDate.toLocalDate() + ":");
        for (Event event : eventsOnDate) {
            System.out.println(event.getName() + " " + event.getStartDateTime() + " - " + event.getEndDateTime());
        }

        // Проверяем, пересекаются ли времена двух событий
        boolean overlap = scheduler.areEventsOverlapping(event1, event2);
        System.out.println("\nСобытия пересекаются: " + overlap);
    }
}
