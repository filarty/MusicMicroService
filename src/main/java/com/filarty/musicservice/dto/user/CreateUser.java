package com.filarty.musicservice.dto.user;


import lombok.Data;

import java.io.Serializable;

@Data
public class CreateUser implements Serializable {
    private String username;
    private String email;
    private String password;
}

