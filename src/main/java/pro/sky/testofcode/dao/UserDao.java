package pro.sky.testofcode.dao;

import pro.sky.testofcode.model.User;

import java.util.List;

public interface UserDao {


    User getUserByName(String name);

    List<User> findAllUsers();
}
