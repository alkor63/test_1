package pro.sky.testofcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {
    User out = new User("myLogin", "test@email.ru");

    @Test
    @DisplayName("Проверка создания объекта new User с двумя параметрами")
    public void shouldReturnMessageWhenLoginAndEMailIsCorrect() {
        Assertions.assertDoesNotThrow(() -> {
            new User("myLogin", "test@email.ru");
        }, "login & eMail введены корректно");
    }

    @Test
    @DisplayName("Проверка создания объекта new User без параметров")
    public void shouldReturnMessageWhenLoginAndEMailIsAbsent() {
        Assertions.assertDoesNotThrow(() -> {
            new User();
        }, "login и eMail не введены");
    }

    @Test
    @DisplayName("Проверка выбрасывания исключения, если в строке email нет символов @ и .")
    public void shouldReturnTrowsWhenEMailIsIncorrect() {
        String result = out.getEmail();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("myLogin", "testemailru");
        });
    }

    @Test
    @DisplayName("Проверка выбрасывания исключения, если login и email равны")
    public void shouldReturnTrowsWhenLoginEqualsEMail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("test@email.ru", "test@email.ru");
        });
    }
}