package com.example.FlipkartDummy.service;

import com.example.FlipkartDummy.model.ApiResponse;
import com.example.FlipkartDummy.model.LoginRequestDTO;
import com.example.FlipkartDummy.model.SignUpRequestDTO;

public interface IUserService {

    ApiResponse<SignUpRequestDTO> SignUp(SignUpRequestDTO signUpRequestDTO);

    ApiResponse<String> Login(LoginRequestDTO loginRequestDTO);

}
