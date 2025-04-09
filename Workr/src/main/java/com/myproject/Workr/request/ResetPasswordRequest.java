package com.myproject.Workr.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {

    private String password;
    private String token;


}
