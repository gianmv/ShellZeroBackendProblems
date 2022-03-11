package com.shellzero.pruebas.usuarios;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserManagementTest {

    @Test
    public void testGetPeopleAvailableForCreditCard01() {
        List<User> allUsers = List.of(
                new User("example01@example.com", "Eduardo", 24, "Mexico", 5000),
                new User("example02@example.com", "Carlos", 19, "Chiapas", null),
                new User("example03@example.com", "Eduardo", 18, "Oaxaca", 700),
                new User("example04@example.com", "Pedro", null, "Yucatan", 1000)
        );

        assertEquals(List.of(
                new User("example01@example.com", "Eduardo", 24, "Mexico", 5000)
        ), UserManagement.getPeopleAvailableForCreditCard(allUsers, 999));
    }

    @Test
    public void testGetPeopleFromUniqueState() {
        List<User> allUsers = List.of(
                new User("example01@example.com", "Eduardo", 24, "Mexico", 5000),
                new User("example02@example.com", "Carlos", 19, "Chiapas", null),
                new User("example03@example.com", "Zoraida", 18, "Oaxaca", 700),
                new User("example04@example.com", "Pedro", null, "Yucatan", 1000),
                new User("example01@example.com", "Salvador", 24, "Mexico", 5000),
                new User("example02@example.com", "Pablo", 19, "Chiapas", null),
                new User("example03@example.com", "Arturo", 18, "Oaxaca", 700),
                new User("example04@example.com", "Julian", null, "Yucatan", 1000)
        );

        assertEquals(List.of(
                        new User("example01@example.com", "Salvador", 24, "Mexico", 5000),
                        new User("example02@example.com", "Pablo", 19, "Chiapas", null),
                        new User("example03@example.com", "Zoraida", 18, "Oaxaca", 700),
                        new User("example04@example.com", "Pedro", null, "Yucatan", 1000)
                        ),
                UserManagement.getPeopleFromUniqueState(allUsers));
    }
}