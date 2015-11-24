package am.gitc.chat.dataaccess.manager.impl;

import am.gitc.chat.common.model.User;
import am.gitc.chat.dataaccess.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestClass {

    public static void main(String[] args) {
        EntityManager manager = EntityManagerUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(getUser());
    }




    public static User getUser(){
        User user = new User();
        user.setName("name");
        user.setSurname("surname");
        user.setEmail("email");
        user.setPassword("password");
        return  user;
    }
}
