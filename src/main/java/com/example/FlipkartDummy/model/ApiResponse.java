package com.example.FlipkartDummy.model;

import lombok.*;

//@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ApiResponse<T> {
    public int statusCode;
    public String message;
    public boolean isSuccess;
    public  T result;
}
