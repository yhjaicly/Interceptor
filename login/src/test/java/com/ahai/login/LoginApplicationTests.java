package com.ahai.login;

import com.ahai.login.service.LoginService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LoginApplicationTests {



    @Resource
    private LoginService loginService;

    @Test
    void contextLoads() {

    }

}
