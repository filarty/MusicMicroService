package com.filarty.musicservice.dto.user;


import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateUser implements Serializable {
    private String email;
    private String password;
    private boolean isActive;
}
