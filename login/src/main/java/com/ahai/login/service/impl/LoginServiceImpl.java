package com.ahai.login.service.impl;

import com.ahai.login.dto.User;
import com.ahai.login.mapper.LoginMapper;
import com.ahai.login.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Override
    public User checkPassword(String username, String password) {
        User user = loginMapper.checkPassword(username);
        if (password.equals(user.getPassword())){
            return user;
        }
        return null;
    }

    @Override
    public User getUserInfo() {
        return loginMapper.getUserInfo();
    }


    @Override
    public Map success(int code){
        HashMap<String, Object> map = new HashMap<>();
        User user = loginMapper.getUserInfo();
        map.put("code",code);
        map.put("user",user);
        return map;
    }
}
