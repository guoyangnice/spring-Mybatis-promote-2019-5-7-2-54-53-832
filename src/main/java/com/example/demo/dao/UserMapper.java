package com.example.demo.dao;

import com.example.demo.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    // 1. 实现查询所有用户
    @Select("select * from user")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name")
    })
    Page<User> findAll();
    // 2. 根据用户id查询用户

    // 3. 添加新用户

    // 4. 根据用户id删除用户

    // 5. 根据用户id更新用户

}