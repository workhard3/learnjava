package com.hard.service;

import com.hard.eneity.User;

/**
 * About：
 * Date：
 */
public interface UserService {

    String selectUser(String name,String password);
    String saveUser(String name,String password);
}
