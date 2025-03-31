package com.katreo.blog.dto;

import com.katreo.blog.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String password;
    private Role role; // Enum'dan gelen USER veya ADMIN
}
