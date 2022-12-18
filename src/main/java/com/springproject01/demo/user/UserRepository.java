package com.springproject01.demo.user;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {

    @Select("select * from user")
    List<UserEntity> findAll();

    @Select("select * from user where user_id = #{user_id}")
    UserEntity findById(int user_id);

    @Insert("insert into user (login_id,user_name,email,password) values (#{login_id},#{user_name},#{email},#{password})")
    void insert(@Param("login_id") String login_id, @Param("user_name") String user_name, @Param("email") String email,
            @Param("password") String password);
}
