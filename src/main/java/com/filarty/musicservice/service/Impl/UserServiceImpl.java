package com.filarty.musicservice.service.Impl;

import com.filarty.musicservice.dto.user.CreateUser;
import com.filarty.musicservice.dto.user.GetUser;
import com.filarty.musicservice.dto.user.UpdateUser;
import com.filarty.musicservice.models.User;
import com.filarty.musicservice.repository.UserRepository;
import com.filarty.musicservice.service.UserService;
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
