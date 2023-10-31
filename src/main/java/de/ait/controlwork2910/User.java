package de.ait.controlwork2910;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private List<User> friends = new ArrayList<>();;

    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        List<User> usersToReturn=new ArrayList<>(friends);
        return usersToReturn;
    }

    public boolean addFriend(User newfriend) {
        if(newfriend==null)
        {
            return false;
        }

        for(User friend: friends)
        {
            if(friend.getId()== newfriend.getId())
            {
                return false;
            }
        }

        friends.add(newfriend);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

