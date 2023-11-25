package de.ait.homework51;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirportReader {
    private static final Logger LOGGER = LoggerFactory.getLogger(AirportReader.class);
    public static void main(String[] args) {
        String fileName = "E:\\CHUR1\\homework\\src\\main\\java\\de\\ait\\homework51\\airports.txt";

        try {
            readAndPrintAirports(fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void readAndPrintAirports(String fileName) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
//String line="";
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                System.out.println(parts.length);
                if (parts.length ==3) {
                    String airportName = parts[0].trim();
                    String iataCode = parts[1].trim();
                    String country = parts[2].trim();
                    LOGGER.info("Название: {} Код IATA: {} Страна: {}", airportName, iataCode, country);
                    System.out.println("Название: " + airportName + ", Код IATA: " + iataCode + ", Страна: " + country);
                } else
                {                   System.out.println("Некорректный формат строки: " + line);
                }
            }
        }
        catch(FileNotFoundException exception)
        {
            LOGGER.info("Файл не был найден"+exception.getMessage());
        }
    }
}


