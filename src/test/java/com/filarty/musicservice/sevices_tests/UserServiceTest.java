package com.filarty.musicservice.sevices_tests;

import com.filarty.musicservice.dao.User.GetUser;
import com.filarty.musicservice.models.Enums.Role;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repositories.UserRepository;
import com.filarty.musicservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.List;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;

@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceTest {

    @MockBean
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    private static User user;
    private static GetUser getUser;

    @BeforeEach
    public void setUser() {
        user = new User();
        user.setUserName("filarty");
        user.setEmail("filarty@gmail.com");
        user.setPasword("2124312214");
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(Role.USER);
        user.setRoles(roles);
        user.setActive(true);
    }

    @BeforeEach
    public void SetGetUser() {
        getUser.setUsername(user.getUserName());
        getUser.setEmail(user.getEmail());
        getUser.setActive(user.isActive());
    }


    @Test
    public void getUserByIdTest() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        Assertions.assertEquals(userService.findUserById(1L), getUser);
    }


}
