package org.example.jwtdemo.service;

import org.example.jwtdemo.model.Member;

public interface AuthService {
    void signUpUser(Member member);
    Member loginUser(String id, String password) throws Exception;
}