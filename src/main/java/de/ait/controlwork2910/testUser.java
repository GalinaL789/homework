package de.ait.controlwork2910;

public class testUser {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();

        User user1 = socialNetwork.registerUser(1, "Ivan");
        User user2 = socialNetwork.registerUser(2, "Petr");
        User user3 = socialNetwork.registerUser(3, "Nikolai");

        // Добавление друзей
        user1.addFriend(user2);
        user2.addFriend(user1);
        user2.addFriend(user3);
        user3.addFriend(user2);

        Group group1 = socialNetwork.createGroup(1, "First");
        Group group2 = socialNetwork.createGroup(2, "Second");

        group1.addMember(user1);
        group1.addMember(user2);
        group2.addMember(user2);
        group2.addMember(user3);

        // Создание постов
        Post post1 = socialNetwork.createPost(user1, "Hello, world!");
        Post post2 = socialNetwork.createPost(user2, "Good morning, everyone!");

        // Вывод информации о пользователях, группах и постах
        System.out.println("Users: " + socialNetwork.getUsers().values());
        System.out.println("Groups: " + socialNetwork.getGroups().values());
        System.out.println("Posts: " + socialNetwork.getPosts());
    }
}
