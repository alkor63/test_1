package pro.sky.testofcode.dao.impl;

import pro.sky.testofcode.dao.UserDao;
import pro.sky.testofcode.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static final List<User> userList = new ArrayList<>();
//    public static void makeUserList() {
//        userList.add(new User("Dima",37));
//        userList.add(new User("Julia",26));
//        userList.add(new User("Kirill",29));
//        userList.add(new User("Anna",28));
//        userList.add(new User("Alexey",23));
//        System.out.println("USER_2_name = "+userList.get(1));
//    }

    @Override
    public User getUserByName(String name) {
        System.out.println("listSize = "+ userList.size());
        if (userList.size() == 0) {
            System.out.println("у нас пустой список Юзеров!");
            return null;// лучше какой-нибудь exception
        }
        for (User user : userList) {
            System.out.println("userName = "+user.getName());
            if (user.getName().equals(name)) return user;
        }
        System.out.println("В нашем списке нет Юзера " + name);
        return null;// лучше какой-нибудь exception
    }

    @Override
    public List<User> findAllUsers() {
        if (userList.size() > 0) return userList;
        return null; // лучше какой-нибудь exception
    }
}
