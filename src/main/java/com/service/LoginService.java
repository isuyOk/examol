package com.service;

import com.model.User;
import org.springframework.stereotype.Service;

public interface LoginService {
    public User doLogin(String email,String password,String usertype);
}
