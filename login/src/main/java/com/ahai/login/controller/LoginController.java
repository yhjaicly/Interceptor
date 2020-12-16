package com.ahai.login.controller;

import com.ahai.login.dto.User;
import com.ahai.login.service.LoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class LoginController {

    @Resource
    private LoginService loginService;

    @PostMapping("/login")
    public User login(@RequestBody User user,
                        HttpSession session){

        String username = user.getUsername();
        String password = user.getPassword();
        if (username==null || password ==null){
            return null;
        }
        User user1 = loginService.checkPassword(username,password);
        if (user1!=null){
            System.out.println(user1);
            session.setAttribute("user1", user1);
            return user1;
        }
        return null;
    }

    @GetMapping("/show")
    public Map userinfo(){
        Map map = loginService.success(200);
        System.out.println(map);
        return loginService.success(200);
    }
}
