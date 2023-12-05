package de.ait.homework54;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

//Разработайте класс EventScheduler,
// который управляет списком событий.
//Добавьте методы для добавления,
// удаления событий и получения списка всех запланированных событий.
//
public class EventScheduler {
    private List<Event> events;

    public EventScheduler() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public List<Event> getEventsOnDate(LocalDateTime date) {
        List<Event> eventsOnDate = new ArrayList<>();
        for (Event event : events) {

            if (event.getStartDateTime().toLocalDate().isEqual(date.toLocalDate())) {
                eventsOnDate.add(event);
            }
        }
        return eventsOnDate;
    }

    public boolean areEventsOverlapping(Event event1, Event event2) {
        LocalDateTime start1 = event1.getStartDateTime();
        LocalDateTime end1 = event1.getEndDateTime();
        LocalDateTime start2 = event2.getStartDateTime();
        LocalDateTime end2 = event2.getEndDateTime();

        return start1.isBefore(end2) && end1.isAfter(start2);
    }
}


