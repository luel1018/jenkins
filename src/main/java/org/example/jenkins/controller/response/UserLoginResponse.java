package org.example.jenkins.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginResponse {
    private int id ;
    private String email;
    private String userName;
}
