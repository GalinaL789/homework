package de.ait.homework48;
import java.util.ArrayList;

public class AuthentificationService {
    public static ArrayList<User> allUsers;

    static {
        allUsers = new ArrayList<User>();
        User user1 = new User("Ivanov", "234etd");
        User user2 = new User("Petrov", "235rrrt");
        User user3 = new User("Сидоров", "235648");
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
    }

    public boolean authenticate(String userName, String userPassword) throws AuthenticationException {
        for (User user : allUsers) {
            if (user.getUserName().equals(userName) && userPassword.equals(user.getPassword())) {
                System.out.println("Авторизация прошла успешно"); // LOG
                return true; // Terminate the loop when a match is found
            }
        }
        throw new AuthenticationException("Авторизация не прошла");
    }
}