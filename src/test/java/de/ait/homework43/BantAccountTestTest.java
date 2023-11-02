package de.ait.homework43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BantAccountTestTest {
    private BankAccount bankAccountSven;
    private BankAccount bankAccountPeter;

    @BeforeEach
    void setUp() {
        bankAccountSven = new BankAccount("Sven", 500.0);
        bankAccountPeter = new BankAccount("Peter", 1200.0);
    }

    @Test
    void testGetOwner() {
        assertEquals("Sven", bankAccountSven.getOwner());
    }

    @Test
    void testGetBalance() {
        assertEquals(500.0, bankAccountSven.getBalance());
    }

    @Test
    void setBalance() {
        bankAccountPeter.setBalance(1000.0);
        assertEquals(1000.0, bankAccountPeter.getBalance());
    }

    @Test
    void deposit() {
        assertTrue(bankAccountSven.deposit(500));
        bankAccountPeter.setBalance(200);
        assertFalse(bankAccountPeter.deposit(10));
    }

    @Test
    void withdraw() {
        assertTrue(bankAccountSven.withdraw(100));
        assertFalse(bankAccountPeter.withdraw(6000));
    }

    @Test
    void checkBalance() {
        double balance = bankAccountPeter.checkBalance();
        assertEquals(3000.0, balance);
    }

}