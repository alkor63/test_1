package pro.sky.testofcode.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.testofcode.dao.UserDao;
import pro.sky.testofcode.model.User;
import pro.sky.testofcode.service.impl.UserServiceImpl;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    public static final User user1= new User("Dima",37);
    public static final User user2= new User("Toma",22);
    public static List<User> userList = new ArrayList<>();

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl userService;
    @Test
    @DisplayName("Проверка метода checkUserExist когда User есть в списке")
    public void shouldReturnTrueWhenFindUser() {
        when(userDaoMock.findAllUsers()).thenReturn((userList));
        assertTrue(userService.checkUserExist(user1));
    }
    @Test
    @DisplayName("Проверка метода checkUserExist когда User в списке отсутствует")
    public void shouldReturnFalseWhenDoNotFindUser() {
        when(userDaoMock.findAllUsers()).thenReturn((userList));
        assertFalse(userService.checkUserExist(user2));
    }
    @BeforeAll
    public static void makeUserList() {
        userList.add(new User("Dima",37));
        userList.add(new User("Julia",26));
        userList.add(new User("Kirill",29));
        userList.add(new User("Anna",28));
        userList.add(new User("Alexey",23));
    }
}