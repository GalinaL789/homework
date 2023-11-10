package de.ait.homework47;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        // Добавьте другие курсовые значения при необходимости
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа конвертации валют");
        while (true) {
            try {
                double amount = getAmountFromUser(scanner);

                String sourceCurrency = getCurrencyCodeFromUser(scanner, "Введите код исходной валюты (USD, EUR): ");
                String targetCurrency = getCurrencyCodeFromUser(scanner, "Введите код целевой валюты (USD, EUR): ");

                double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

                System.out.println(amount + " " + sourceCurrency + " = " + convertedAmount + " " + targetCurrency);
                System.out.println("Операция конвертации завершена.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите числовое значение для суммы.");
                scanner.nextLine(); // очистка буфера ввода
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private static double getAmountFromUser(Scanner scanner) {
        System.out.print("Введите сумму для конвертации: ");
        return Double.parseDouble(scanner.nextLine());
    }

    private static String getCurrencyCodeFromUser(Scanner scanner, String prompt) {
        String currencyCode;
        while (true) {
            System.out.print(prompt);
            currencyCode = scanner.nextLine().toUpperCase();
            if (exchangeRates.containsKey(currencyCode)) {
                break;
            } else {
                System.out.println("Ошибка: несуществующий код валюты.");
            }
        }
        return currencyCode;
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        if (sourceRate == 0 || targetRate == 0) {
            throw new IllegalArgumentException("Несуществующий код валюты.");
        }

        return amount * (targetRate / sourceRate);
    }
}


