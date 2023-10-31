package de.ait.controlwork2910;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group {
    private int id;
    private String name;
    private Set<User> members = new HashSet<>();

    public Group(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(name, group.name) && Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, members);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<User> getMembers() {
        Set<User> userSetReturn = new HashSet<>(members);
        return userSetReturn;
    }

    public boolean addMember(User user) {
        if (user == null) {
            return false;
        }
        if (!members.contains(user)) {
            members.add(user);
            return true;
        }
        else
        {
            return false;
        }

    }

}

