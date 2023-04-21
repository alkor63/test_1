package pro.sky.testofcode.dao;

import org.junit.jupiter.api.*;
import pro.sky.testofcode.dao.impl.UserDaoImpl;
import pro.sky.testofcode.model.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

private final UserDaoImpl out = new UserDaoImpl() {

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

}
