package de.ait.homework48;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
public class Authentication {

    public static void main(String[] args) {
        public ArrayList<User> allUsers = new ArrayList<User>();
        User user1 = new User("Ivanov", "234etd");
        User user2 = new User("Petrov", "235rrrt");
        allUsers.add(user1);
        allUsers.add(user2);
    }
    public void authenticate(String userName, String userPassword)
        {
        try
    {
        for (User users : this.allUsers) {
            if (userName.equals(users.getUserName()) && userPassword.equals(users.getPassword())) {
                System.out.println("Авторизация прошла успешно");

            }
            else {
                throw new AuthenticationException("Ауторизация не прошла");
        }

    }
        catch(AuthenticationException exception)
        {
            System.out.println("Авторизация не прошла");


        }


        }
    }

}
