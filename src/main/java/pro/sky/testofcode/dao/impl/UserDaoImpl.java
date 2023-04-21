package pro.sky.testofcode.dao.impl;

import pro.sky.testofcode.dao.UserDao;
import pro.sky.testofcode.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private final List<User> userList = new ArrayList<>();

    {
        userList.add(new User("Dima", 37));
        userList.add(new User("Julia", 26));
        userList.add(new User("Kirill", 29));
        userList.add(new User("Anna", 28));
        userList.add(new User("Alexey", 23));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : userList) {
            System.out.println("userName = " + user.getName());
            if (user.getName().equals(name)) return user;
        }
        System.out.println("В нашем списке нет Юзера " + name);
        return null;// лучше какой-нибудь exception
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}
