package pro.sky.testofcode.service.impl;

import pro.sky.testofcode.dao.UserDao;
import pro.sky.testofcode.model.User;
import pro.sky.testofcode.service.UserService;

import java.util.List;


public class UserServiceImpl implements UserService {
    public final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        List<User> userList = userDao.findAllUsers();
        return userList.contains(user);
    }
}
