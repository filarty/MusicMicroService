package com.filarty.musicservice.models;

import com.filarty.musicservice.models.Enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, columnDefinition = "SERIAL")
    private Long id;
    @Column(name = "username", unique = true, nullable = false)
    private String userName;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String pasword;
    @Column(name = "roles", nullable = false)
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class)
    @JoinTable(name = "roles", joinColumns = @JoinColumn(name = "user_id", nullable = false))
    private List<Role> roles;
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
}
