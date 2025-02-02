package org.example.springboot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public List<User> getUsers() {
      return entityManager.createQuery("from User").getResultList();
   }

   @Override
   public void saveUser(User user) {
      entityManager.persist(user);
   }

   @Override
   public void updateUser(User user) {
      entityManager.merge(user);
   }

   @Override
   public User findById(int id) {
      return entityManager.find(User.class, id);
   }

   @Override
   public void deleteUser(int id) {
      User user = findById(id);
      if (user != null) {
         entityManager.remove(user);
      }
   }
}
