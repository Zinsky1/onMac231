package web.dao;


import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void add(User user) {
      entityManager.persist(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      //TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      //return query.getResultList();
      TypedQuery<User> query = (TypedQuery<User>) entityManager.createQuery("from User");
      return query.getResultList();
   }

   @Override
   public User getUser(int id) {
      return null;
   }

   @Override
   public void deleteUser(int id) {
      System.out.println("d");
   }

}
