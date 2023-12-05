package de.ait.homework54;

import java.time.LocalDateTime;

//Класс события:
//Создайте класс Event, который содержит следующие поля:
//String name - название события.
//LocalDateTime startDateTime - дата и время начала события.
//LocalDateTime endDateTime - дата и время окончания события.
//Реализуйте конструкторы, геттеры и сеттеры для этих полей.
//
public class Event {
    private String name;
    private LocalDateTime  startDateTime;
    private LocalDateTime endDateTime;

    public Event(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.name = name;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
