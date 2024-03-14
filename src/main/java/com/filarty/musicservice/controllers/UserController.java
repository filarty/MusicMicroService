package com.filarty.musicservice.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/v1/users")
public class UserController {

    @GetMapping("/login")
    public String getLogin() {
        return
                "{status: ok}";
    }

    @PostMapping("/login")
    public String sendLogin() {
        return
                "{status: ok}";
    }

    @PostMapping("/register")
    public String register() {
        return "{status: ok}";
    }

    @PostMapping("/logout")
    public String logout() {
        return "{status: ok}";
    }

    @GetMapping("/profile")
    public String getProfile() {
        return "{status: ok}";
    }

    @PostMapping("/register/confirm")
    public String confirmRegister() {
        return "{status: ok}";
    }

    @GetMapping("/register/confirm")
    public String sendConfirmRegister() {
        return "{status: ok}";
    }


}
