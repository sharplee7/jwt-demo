package org.example.jwtdemo.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RequestVerifyEmail {
    String username;
}