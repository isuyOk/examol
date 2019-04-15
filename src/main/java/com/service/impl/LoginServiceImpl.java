package com.service.impl;

import com.mapper.UserMapper;
import com.model.User;
import com.model.UserExample;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User doLogin(String email,String password,String usertype) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andEmailEqualTo(email).andPasswordEqualTo(password)
                .andUserTypeEqualTo(usertype);
        List<User> list=userMapper.selectByExample(userExample);
        if (list.size()>0){
            return list.get(0);
        }else {
            return null;
        }

    }
}
