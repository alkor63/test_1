package pro.sky.testofcode;

import java.util.Objects;

public class User {
private String login;
private String email;
public User(){}

    public User(String login, String email) {
        if (nullString(login)) {
            throw new IllegalArgumentException("*** login должен состоять из символов! ***");
        }
        if (!checkCorrectEMail(email)) {
            throw new IllegalArgumentException("*** email должен состоять из символов, в том числе @ и . ***");
        }
        if (checkEquals2Strings(login,email)) {
            throw new IllegalArgumentException("*** login не должен совпадать с email ***");}
        this.login = login;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }

    public static boolean nullString(String s) {
        return (s == null || s.isEmpty() || s.isBlank());
    }
    public static boolean checkCorrectEMail(String email) {
    return  (!nullString(email) && email.contains("@") && email.contains("."));
    }
    public static boolean checkEquals2Strings(String s1, String s2){
        return s1.equals(s2);
    }

}
