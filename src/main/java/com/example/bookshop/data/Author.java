package com.example.bookshop.data;

public class Author {
    private Integer id;
    private String userName;

    @Override
    public String toString() {
        return "\nAuthor{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
