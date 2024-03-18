package com.filarty.musicservice.repository_test;
import com.filarty.musicservice.models.Enums.Role;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repository.UserRepository;
import org.hibernate.PropertyValueException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.NoSuchElementException;
import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private User user;

    @BeforeEach
    public void init() {
        user = new User();
        user.setUserName("filarty");
        user.setEmail("filarty@gmail.com");
        user.setPassword("123");
        user.addRole(Role.USER);
        user.setActive(true);
    }


    @Test
    public void saveUserAndFindTest() {
        User userInDatabase = userRepository.save(user);
        Long userId = userInDatabase.getId();
        Optional<User> response = userRepository.findById(userId);
        response.ifPresent(value -> Assertions.assertEquals(value, user));
    }

    @Test()
    public void userNotFoundTest(){
        Optional<User> user = userRepository.findById(1L);
        Assertions.assertThrows(NoSuchElementException.class, user::get);
    }

    @Test()
    public void saveUserExceptionTest() {
        User userNew = new User();
        Assertions.assertThrows(DataIntegrityViolationException.class, () -> userRepository.save(userNew));
    }
}
