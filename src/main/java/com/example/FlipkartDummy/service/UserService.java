package com.example.FlipkartDummy.service;

import com.example.FlipkartDummy.model.ApiResponse;
import com.example.FlipkartDummy.model.SignUpRequestDTO;
import com.example.FlipkartDummy.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;


    @Override
    public ApiResponse<SignUpRequestDTO> SignUp(SignUpRequestDTO signUpRequestDTO) {

        SignUpRequestDTO savedUser= userRepository.save(signUpRequestDTO);
        return new ApiResponse<>(200, "User signed up successfully",true, savedUser);
    }
}
