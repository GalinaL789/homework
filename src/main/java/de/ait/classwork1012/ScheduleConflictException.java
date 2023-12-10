package de.ait.classwork1012;

// Исключение для пересечения времен показа фильмов
class ScheduleConflictException extends RuntimeException {
    public ScheduleConflictException(String message) {
        super(message);
    }
}

