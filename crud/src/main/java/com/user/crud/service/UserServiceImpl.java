package com.user.crud.service;

import com.user.crud.entity.User;

import java.util.ArrayList;

public class UserServiceImpl implements  UserService{
    ArrayList<User> users = new ArrayList<>();
    @Override
    public int createUser(User user) {
        return 0;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public String deleteUser(int id) {
        return null;
    }

    @Override
    public User updateUser(int id) {
        return null;
    }
}
