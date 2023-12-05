package de.ait.classwork312;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeDAte {
    public static void main(String[] args) {
        LocalDate localDateOne = LocalDate.of(2030, 01,01);
        LocalDate localDateTwo = LocalDate.now();
        long result = ChronoUnit.DAYS.between(localDateTwo, localDateOne);
        System.out.println(result);
// Установим временную зону для Парижа
                ZoneId parisZone = ZoneId.of("Europe/Paris");

                // Получим текущее время в Париже
                ZonedDateTime parisTime = ZonedDateTime.now(parisZone);

                // Определим формат вывода времени
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Выведем текущее время в Париже
                System.out.println("Текущее время в Париже: " + parisTime.format(formatter));
            }
        }

