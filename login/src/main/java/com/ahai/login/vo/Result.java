package com.ahai.login.vo;

import com.ahai.login.dto.User;
import com.ahai.login.service.LoginService;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Data
public class Result {
    private int code;
    private String msg;
    private List<?> list;
    private Object obj;

    @Resource
    private LoginService loginService;

    public Map success(int code){
        HashMap<String, Object> map = new HashMap<>();
        User user = loginService.getUserInfo();
        map.put("code",code);
        map.put("user",user);
        return map;
    }
}
