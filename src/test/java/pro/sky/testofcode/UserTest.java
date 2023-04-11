package pro.sky.testofcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pro.sky.testofcode.User.*;

class UserTest {
    User out = new User("myLogin","test@email.ru");

    @Test
    @DisplayName("Проверка создания объекта new User с двумя параметрами")
    public void shouldReturnMessageWhenLoginAndEMailIsCorrect() {
        Assertions.assertDoesNotThrow(() -> {new User("myLogin","test@email.ru");},"login & eMail введены корректно");
 }

    @Test
    @DisplayName("Проверка создания объекта new User без параметров")
    public void shouldReturnMessageWhenLoginAndEMailIsAbsent() {
        Assertions.assertDoesNotThrow(() -> {new User();},"login и eMail не введены");
    }

    @Test
    @DisplayName("Проверка наличия в строке email символов @ и .")
    public void shouldReturnTrueWhenEMailIsCorrect() {
        String result = out.getEmail();
        Assertions.assertTrue(checkCorrectEMail(result), "некорректный значкние email: "+result);
    }
    @Test
    @DisplayName("Проверка равенства строк login и email")
    public void shouldReturnTrueWhenLoginEqualsEMail() {
        String result = out.getEmail();
        Assertions.assertFalse(checkEquals2Strings(result,out.getLogin()), "login & email = "+result);
    }

}