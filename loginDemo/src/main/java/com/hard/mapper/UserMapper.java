package com.hard.mapper;

import com.hard.eneity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * About：
 * Date：
 */

@Repository
public interface UserMapper {

    //登录

    @Select("select id,name,password from hard where name=#{name}")
    User selectUser(@Param("name") String name, @Param("password") String password);
    //注册
    @Insert("insert into hard(name,password) values(#{name},#{password})")
    int saveUser(String name,String password);
}
