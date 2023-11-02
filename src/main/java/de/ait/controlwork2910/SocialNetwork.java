package de.ait.controlwork2910;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class SocialNetwork {
    private Map<Integer, User> users;
    private Map<Integer, Group> groups;
    private ArrayList<Post> posts;

    public SocialNetwork() {
        users = new HashMap<>();
        groups = new HashMap<>();
        posts = new ArrayList<>();
    }

    public User registerUser(int id, String name) {
        if(name ==null)
        {
            return null;
        }
        for(Map.Entry<Integer, User> user: users.entrySet())
        {
            if (user.getKey().equals(Integer.valueOf(id)))
            {
                return null;
            }
        }
        User user = new User(id, name);
        users.put(id, user);
        return user;
    }

    public Group createGroup(int id, String name) {
        Group group = new Group(id, name);
        groups.put(id, group);
        return group;
    }

    public Post createPost(User author, String content) {
        int postId = posts.size() + 1;
        Post post = new Post(postId, content, author);
        posts.add(post);
        return post;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public Map<Integer, Group> getGroups() {
        return groups;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
}
