package de.ait.controlwork2910;

import java.util.Objects;

class Post {
    private int id;
    private String content;
    private User author;

    public Post(int id, String content, User author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(User author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return id == post.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
