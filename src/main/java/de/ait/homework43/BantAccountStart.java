package de.ait.homework43;

public class BantAccountStart {
    public static void main(String[] args) {
        // Создание экземпляров BankAccount
        BankAccount accountPeter = new BankAccount("Peter", 500.0);
        BankAccount accountSven = new BankAccount("Sven", 1300.0);

        // Проведение операций
        accountPeter.deposit(200.0);
        accountSven.withdraw(300.0);
        accountPeter.checkBalance();
        accountSven.checkBalance();

    }
}