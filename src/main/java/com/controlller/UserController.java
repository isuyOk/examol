package com.controlller;

import com.model.User;
import com.result.CodeMsg;
import com.result.Result;
import com.service.UserService;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    显示所有普通用户
    @GetMapping("/user/all")
    public String showAllUser(Model model){
        List<User> users=userService.findAllUser();
        model.addAttribute("users",users);
        return "alluser";
    }

//    进入用户信息修改页面
    @GetMapping("/user/toupdate/{userId}")
    public String toUpdate(Model model, @PathVariable("userId") int userId){
        User user=userService.findById(userId);
        model.addAttribute("user",user);
        return "updateuser";
    }

//    执行用户信息修改
    @RequestMapping("/user/doupdate")
    @ResponseBody
    public Result doUpdate(User user){
        boolean a=userService.updateUser(user);
        if (a){
           return Result.success(CodeMsg.UPDATE_SUCCESS);
        }else {
            return Result.error(CodeMsg.UPDATE_FAILE);
        }
    }

//    删除用户
    @RequestMapping("/user/dodelete/{userid}")
    @ResponseBody
    public Result deleteUser(@PathVariable("userid") int userId){
        boolean result=userService.deleteUser(userId);
        if (result){
            return Result.success(CodeMsg.DELETE_SUCCESS);
        }else {
            return Result.error(CodeMsg.DELETE_FAILE);
        }
    }

//    进入用户添加页面
    @RequestMapping("/user/adduser")
    public String toAddUser(){
        return "adduser";
    }

//    执行添加用户
    @RequestMapping("/user/doadd")
    @ResponseBody
    public Result insertUser(User user){
        boolean result=userService.insertUser(user);
        if (result){
            return Result.success(CodeMsg.ADD_SUCCESS);
        }else {
            return Result.error(CodeMsg.ADD_FAILE);
        }
    }
}
