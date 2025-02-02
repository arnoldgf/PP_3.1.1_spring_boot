package org.example.springboot.service;


import org.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(int id);
}
