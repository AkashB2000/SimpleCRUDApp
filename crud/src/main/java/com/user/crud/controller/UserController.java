package com.user.crud.controller;


import com.user.crud.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
public class UserController {
    ArrayList<User> userDB = new ArrayList<>();
    @GetMapping
    public ArrayList<User> getUsers() {
        return userDB;
    }
    @GetMapping("/{id}")
    public User getUsers(@PathVariable int id) {
        for (User user : userDB) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {

        userDB.add(user);
        return "User " + user.getName() + " Created";
    }

    @DeleteMapping("/{id}")
    public ArrayList<User> deleteUser(@PathVariable int id) {
        for (User item : userDB) {
            if (item.getId() == id) {
                userDB.remove(item);

            }
        }
        return userDB;
    }
}
