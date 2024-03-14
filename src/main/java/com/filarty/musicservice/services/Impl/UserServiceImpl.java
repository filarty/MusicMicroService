package com.filarty.musicservice.services.Impl;

import com.filarty.musicservice.dao.User.CreateUser;
import com.filarty.musicservice.dao.User.GetUser;
import com.filarty.musicservice.dao.User.UpdateUser;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repositories.UserRepository;
import com.filarty.musicservice.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public GetUser findUserById(Long id) {
        return null;
    }

    @Override
    public GetUser saveUser(CreateUser createUser) {
        return null;
    }

    @Override
    public GetUser deleteUserById(Long id) {
        return null;
    }

    @Override
    public GetUser updateUser(UpdateUser updateUser) {
        return null;
    }
}
