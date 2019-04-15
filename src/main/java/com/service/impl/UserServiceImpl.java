package com.service.impl;

import com.mapper.UserMapper;
import com.model.User;
import com.model.UserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

//    查询所有普通用户
    @Override
    public List<User> findAllUser() {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUserTypeEqualTo("general");
        return userMapper.selectByExample(userExample);
    }

//    根据username查询用户
    @Override
    public List<User> findByName(String userName) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameEqualTo(userName);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> findByEmail(String email) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andNameEqualTo(email);
        return userMapper.selectByExample(userExample);
    }

    @Override
    public boolean insertUser(User user) {
       int result= userMapper.insert(user);
       if (result>0){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public User findById(int userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    public boolean deleteUser(int userId) {
        userMapper.deleteByPrimaryKey(userId);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
        return true;
    }


}
