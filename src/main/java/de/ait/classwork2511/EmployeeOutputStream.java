package de.ait.classwork2511;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeOutputStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOutputStream.class);

    private static String path = "employees.obj";

    public static void main(String[] args) {
        Employee employeeBatman = new Employee(1876, "Batman", 2000);
        Employee employeeRobin = new Employee(2000, "Robin", 65000);
        List<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employeeBatman);
        employeeArrayList.add(employeeRobin);
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(employeeArrayList);
            outputStream.flush();
            LOGGER.info("Данные сотрудника(ов) успешно сохранены. id: {}", employeeBatman.getId());
        } catch (FileNotFoundException exception) {
            LOGGER.error("Файл {} не найден или не создан {}", path, exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("Ошибка в обработке данных. Файл {}, {}", path, exception.getMessage());
        }
    }
}

