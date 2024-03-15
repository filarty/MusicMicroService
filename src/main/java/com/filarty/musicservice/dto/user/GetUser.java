package com.filarty.musicservice.dto.user;


import lombok.Data;

import java.io.Serializable;

@Data
public class GetUser implements Serializable {
    private String username;
    private String email;
    private boolean isActive;
}
