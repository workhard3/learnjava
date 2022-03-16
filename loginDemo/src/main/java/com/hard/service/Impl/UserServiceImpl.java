package com.hard.service.Impl;

import com.hard.eneity.User;
import com.hard.mapper.UserMapper;
import com.hard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * About：
 * Date：
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String selectUser(String name, String password) {
        if (!StringUtils.hasLength(name)){
            return "用户名不能为空";
        }
        if (!StringUtils.hasLength(password)){
            return "密码不能为空";
        }
        User user = userMapper.selectUser(name, password);
        if (user==null){
            return "登录失败";
        }
        if (password.equals(user.getPassword())){
            return "登录成功";

        }
        return "登录失败";
    }

    @Override
    public String saveUser(String name, String password) {
        if (!StringUtils.hasLength(name)){
           return "用户名不能为空";
        }
        if (!StringUtils.hasLength(password)){
           return "密码不能为空";
        }
        User user = userMapper.selectUser(name, password);
        if (user!=null){
            return "用户已注册";
        }
        int i = userMapper.saveUser(name, password);
        if (i==1){
            return "注册成功";
        }

        return "注册失败";

    }



}
