package pro.sky.testofcode.dao;

import org.junit.jupiter.api.*;
import pro.sky.testofcode.dao.impl.UserDaoImpl;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    private final UserDao out = new UserDaoImpl();

    @Test
    @DisplayName("Проверка метода getUserByName - поиск User по имени")
    public void shouldReturnMessageWhenNameExistInArrayList() {
        assertNotNull(out.getUserByName("Dima"));
    }

    @Test
    @DisplayName("Проверка метода getUserByName когда User с искомым именем отсутствует")
    public void shouldReturnMessageWhenLoginAndEMailIsAbsent() {
        assertNull(out.getUserByName("Vova"));
    }
}
