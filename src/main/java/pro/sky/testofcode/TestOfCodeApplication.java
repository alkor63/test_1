package pro.sky.testofcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.testofcode.dao.impl.UserDaoImpl;
import pro.sky.testofcode.model.User;

@SpringBootApplication
public class TestOfCodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestOfCodeApplication.class, args);

    }
}
