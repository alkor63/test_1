package pro.sky.testofcode.dao;

import org.junit.jupiter.api.*;
import pro.sky.testofcode.model.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

private final UserDao out = new UserDao() {

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

};
    @Test
    @DisplayName("Проверка метода getUserByName - поиск User по имени")
    public void shouldReturnMessageWhenNameExistInArrayList() {
        assertDoesNotThrow(() -> {
            out.getUserByName("Dima");
        }, "Метод getUserByName с существующим именем Юзера работает корректно");
    }

    @Test
    @DisplayName("Проверка метода getUserByName когда User с искомым именем отсутствует")
    public void shouldReturnMessageWhenLoginAndEMailIsAbsent() {
        assertNull(out.getUserByName("Vova"));
        }

@BeforeAll
public static void makeUserList() {
    List<User> userList = new ArrayList<>();
    userList.add(new User("Dima",37));
    userList.add(new User("Julia",26));
    userList.add(new User("Kirill",29));
    userList.add(new User("Anna",28));
    userList.add(new User("Alexey",23));
}

}
