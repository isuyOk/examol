package com.test;

import com.mapper.TitleMapper;
import com.model.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.vo.TitleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Yk {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    TitleMapper titleMapper;
    @RequestMapping("/test")
    public String dk(){
       return "error";
    }
}
