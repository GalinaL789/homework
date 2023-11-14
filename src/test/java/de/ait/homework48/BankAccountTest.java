package de.ait.homework48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account =new BankAccount("1234", "Sven", 500.0);
    }
    @Test
    public void testDeposit() {
        account.deposit(500.0);
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("AA1234", "Иванов", 500.0);
        account.withdrawal(100.0);
        assertEquals(400.0, account.getBalance());
    }
    @Test
    public void testWithdrawFailure(){
        System.out.println(account.getBalance());
        InsufficientFundsException exception = assertThrows(InsufficientFundsException.class,
                ()->account.withdrawal(2000.00));
        assertEquals("Пополните сначала счет", exception.getMessage());
    }

/*   @Test
    public void testNegativeWithdraw() {
        BankAccount account = new BankAccount("СС1245", "Сидоров", -200);
        account.withdraw(-200.0);
    }*/
}
