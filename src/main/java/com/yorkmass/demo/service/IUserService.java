package com.yorkmass.demo.service;

import com.yorkmass.demo.model.User;

public interface IUserService {
    public void register(String username,String password);
    public User findByUsername(String username);
}
