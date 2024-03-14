package com.filarty.musicservice.sevices_tests;

import com.filarty.musicservice.dao.User.GetUser;
import com.filarty.musicservice.models.Enums.Role;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repositories.UserRepository;
import com.filarty.musicservice.services.Impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    private static User user;
    private static GetUser getUser;

    @BeforeEach
    public void init() {
        createUser();
        getUser = new GetUser();
        getUser.setUsername(user.getUserName());
        getUser.setEmail(user.getEmail());
        getUser.setActive(user.isActive());
    }

    public void createUser() {
        user = new User();
        user.setUserName("filarty");
        user.setEmail("filarty@gmail.com");
        user.setPasword("2124312214");
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(Role.USER);
        user.setRoles(roles);
        user.setActive(true);
    }


    @Test
    public void getUserByIdTest() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        Assertions.assertEquals(userService.findUserById(1L), getUser);
    }


}
