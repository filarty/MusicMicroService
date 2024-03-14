package com.filarty.musicservice.dao.User;


import lombok.Data;

@Data
public class UpdateUser {
    private String email;
    private String password;
    private boolean isActive;
}
