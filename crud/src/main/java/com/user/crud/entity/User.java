package com.user.crud.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

