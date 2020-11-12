package org.example.jwtdemo.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestChangePassword2 {
    String username;
    String password;
}