package com.filarty.musicservice.service;

import com.filarty.musicservice.dto.user.CreateUser;
import com.filarty.musicservice.dto.user.GetUser;
import com.filarty.musicservice.dto.user.UpdateUser;


public interface UserService {
    public GetUser findUserById(Long id);
    public GetUser saveUser(CreateUser createUser);
    public GetUser deleteUserById(Long id);
    public GetUser updateUser(UpdateUser updateUser);
}
