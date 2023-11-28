package de.ait.classwork2511;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class EmployeeInputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInputStream.class);

    private static String path = "employees.obj";

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            List<Employee> employeeList = (List<Employee>) objectInputStream.readObject();
            for (Employee employee : employeeList) {
                if (employee.getId() == 2000 && employee.getSalary() >= 50000) {
                    LOGGER.info("Объект успешно найден, ID: {}, Name: {}", employee.getId(), employee.getName());
                } else {
                    LOGGER.warn("Объект не подходит под описание, ID: {}, Name: {}", employee.getId(), employee.getName());
                }
            }

        } catch (FileNotFoundException exception) {
            LOGGER.error("Файл {} не найден или не создан {}", path, exception.getMessage());

        } catch (IOException exception) {
            LOGGER.error("Ошибка в обработке данных. Файл {}, {}", path, exception.getMessage());

        } catch (ClassNotFoundException exception) {
            LOGGER.error("Ошибка в поиску класса для десериализации. {}", exception.getMessage());
        }


    }
}
