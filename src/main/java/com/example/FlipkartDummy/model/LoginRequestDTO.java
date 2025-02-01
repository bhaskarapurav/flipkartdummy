package com.example.FlipkartDummy.model;

import lombok.Data;
@Data  // Lombok will generate getters, setters, and constructors
public class LoginRequestDTO {
    public String email;
    public String password;
}
