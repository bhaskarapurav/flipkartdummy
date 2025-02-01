package com.example.FlipkartDummy.controller;

import com.example.FlipkartDummy.model.ApiResponse;
import com.example.FlipkartDummy.model.SignUpRequestDTO;
import com.example.FlipkartDummy.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IdentityController {

    @Autowired
    private IUserService userService;

    @GetMapping("/login")
    public String Login(){
        return "Logged in...";
    }

    @GetMapping("/logout")
    public String Logout(){
        return "Logged out...";
    }

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<SignUpRequestDTO>> SignUp(@Valid @RequestBody SignUpRequestDTO signUpRequestDTO)
    {

        ApiResponse<SignUpRequestDTO> response = userService.SignUp(signUpRequestDTO);

        return  ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
