package org.example.springboot.dao;


import org.example.springboot.model.User;

import java.util.List;

public interface UserDao {

   List<User> getUsers();
   void saveUser(User user);
   void updateUser(User user);
   User findById(int id);
   void deleteUser(int id);
}
