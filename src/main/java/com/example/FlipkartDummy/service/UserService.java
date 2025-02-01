package com.example.FlipkartDummy.service;

import com.example.FlipkartDummy.model.ApiResponse;
import com.example.FlipkartDummy.model.LoginRequestDTO;
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

           @Override
           public ApiResponse<String> Login(LoginRequestDTO loginRequestDTO){
               SignUpRequestDTO loginResponse= userRepository.findByEmail(loginRequestDTO.email);
        if(loginResponse == null){
            return new ApiResponse<>(404,"User Not Found",false,null);
        }
        if(!loginResponse.getPassword().equals(loginRequestDTO.password)){
            return new ApiResponse<>(401,"Logged In Failed",false,null);
        }

        return new ApiResponse<>(200,"SUCCESS",true,null);
    }
}
