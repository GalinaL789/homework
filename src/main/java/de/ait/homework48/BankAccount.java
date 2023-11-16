package de.ait.homework48;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Класс BankAccount:
//
//Поля: accountNumber (String), ownerName (String), balance (double).
//Методы:
//deposit(double amount): увеличивает баланс.
//withdraw(double amount): уменьшает баланс. Если сумма снятия больше баланса, выбрасывает InsufficientFundsException.
//getBalance(): возвращает текущий баланс
public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    //

    //  withdraw(double amount): уменьшает баланс. Если сумма снятия больше баланса,
    //  выбрасывает InsufficientFundsException.
    //  getBalance(): возвращает текущий баланс.
    public double deposit(double amount) {
        balance = balance + amount;
        LOGGER.info("Ваш баланс {} евро", balance);
        return balance;
    }

    public void withdrawal(double amount) throws InsufficientFundsException
    {
        if (amount > balance) {
            LOGGER.error("На счету не хватает средств");
            throw new InsufficientFundsException("Денег не хватает");
        } else {
            balance = balance - amount;
            LOGGER.info("Ваш баланс {} ", balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}

