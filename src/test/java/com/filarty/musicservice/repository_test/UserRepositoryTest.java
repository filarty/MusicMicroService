package com.filarty.musicservice.repository_test;
import com.filarty.musicservice.models.Enums.Role;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@DataJpaTest
@AutoConfigureTestDatabase
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private User user;
    private Long userId;

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
    public void saveUserTest() {
        User resUser = userRepository.save(user);
        userId = resUser.getId();
        Optional<User> response = userRepository.findById(userId);
        System.out.println(response.get().getRole());
    }
}
