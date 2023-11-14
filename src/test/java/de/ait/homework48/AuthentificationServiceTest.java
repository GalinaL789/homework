package de.ait.homework48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthentificationServiceTest {
    private AuthentificationService authentificationService;
    @BeforeEach
    void setUp() {
        authentificationService =new AuthentificationService();
    }
    @Test
    void testAuthenticateSuccess() {
        assertTrue(authentificationService.authenticate("Ivanov", "234etd"));
    }

    @Test
    void testAuthenticateFailure() {
        AuthenticationException exception = assertThrows(AuthenticationException.class,
                () -> authentificationService.authenticate("UnknownUser", "WrongPassword"));
        assertEquals("Авторизация не прошла", exception.getMessage());
    }
}


