package com.controlller;

import com.model.User;
import com.result.CodeMsg;
import com.result.Result;
import com.service.LoginService;
import com.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("")
    public String toLogin(){
        return "login";
    }



    @RequestMapping("/dologin")

    public String doLogin(Model model,String email,
                          String password,
                          String userType){
     User user=loginService.doLogin(email,password,userType);

      if (user!=null){
          model.addAttribute("user",user);
          return "index";
      }else {
          return "error";
      }
    }




}
