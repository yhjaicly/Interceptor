package com.ahai.login.mapper;

import com.ahai.login.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    User checkPassword(String username);
    User getUserInfo();
}
