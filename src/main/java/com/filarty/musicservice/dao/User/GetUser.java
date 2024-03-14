package com.filarty.musicservice.dao.User;


import lombok.Data;

@Data
public class GetUser {
    private String username;
    private String email;
    private boolean isActive;
}
