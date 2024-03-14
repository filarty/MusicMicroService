package com.filarty.musicservice.dao.User;


import lombok.Data;

@Data
public class CreateUser {
    private String username;
    private String email;
    private String password;
    private boolean isActive;
}

