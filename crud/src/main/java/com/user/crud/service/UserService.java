package com.user.crud.service;

import com.user.crud.entity.User;

public interface UserService {
    public int createUser(User user);
    public User getUser(int id);
    public String deleteUser(int id);
    public  User updateUser(int id);




}
