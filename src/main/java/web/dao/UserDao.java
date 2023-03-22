package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();

   User getUser(int id);

   public void deleteUser(int id);

   //update user


}
