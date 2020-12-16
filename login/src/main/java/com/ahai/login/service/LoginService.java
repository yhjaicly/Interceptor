package com.ahai.login.service;

import com.ahai.login.dto.User;

import java.util.Map;

public interface LoginService {
    User checkPassword(String username, String password);
    User getUserInfo();
    Map success(int code);
}
