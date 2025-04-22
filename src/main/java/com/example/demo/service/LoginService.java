package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepo;

@Service
public class LoginService {
@Autowired
private LoginRepo repo;
public Login login(String username, String password){
    Login user1=repo.FindByUsernameAndPassword(username, password);
    return user1;
}
}