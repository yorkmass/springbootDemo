package com.yorkmass.demo.mapper;

import com.yorkmass.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    /*
    @Insert("insert t_user (username,password) values(#{username},#{password})")
    public int save(@Param("username") String username, @Param("password") String password);

    @Select("select * from t_user where username=#{username}")
    public User findByUsername(@Param("username") String username);
    */
    public int save(String username, String password);
    public User findByUsername(String username);
}
