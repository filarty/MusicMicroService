package com.filarty.musicservice.services;

import com.filarty.musicservice.dao.User.CreateUser;
import com.filarty.musicservice.dao.User.GetUser;
import com.filarty.musicservice.dao.User.UpdateUser;


public interface UserService {
    public GetUser findUserById(Long id);
    public GetUser saveUser(CreateUser createUser);
    public GetUser deleteUserById(Long id);
    public GetUser updateUser(UpdateUser updateUser);
}
