package com.yorkmass.demo.service.impl;

import com.yorkmass.demo.mapper.UserMapper;
import com.yorkmass.demo.model.User;
import com.yorkmass.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
//Transactional是事务，原子性，出现异常了这一个方法都不会执行。
public class UserServiceImpl implements IUserService {

    @Autowired
    //private JdbcTemplate jdbcTemplate;(jdbc)
    //mybatis
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        //String sql="insert t_user (username,password) values(?,?)";
        //jdbcTemplate.update(sql,username,password); (jdbc)
        userMapper.save(username,password);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
