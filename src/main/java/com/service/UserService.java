package com.service;

import com.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();
    public List<User> findByName(String userName);
    public List<User> findByEmail(String email);
    public boolean insertUser(User user);
    public User findById(int userid);
    public boolean deleteUser(int userId);
    public boolean updateUser(User user);
}
