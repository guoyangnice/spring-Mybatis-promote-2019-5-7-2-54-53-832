package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> findAll() {
        List<User> user  = userMapper.findAll();
        System.out.println(user);
        return user;
    }

    @GetMapping("/findAll")
    public Page<User> findAll(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        Page<User> user = userMapper.findAll();
        return user;
    }

    @GetMapping("/user/{userId}")
    public User findById(@PathVariable long userId) {
        return null;
    }

    @PostMapping("/user")
    public void insertUser(@RequestBody User user) {
    }

    @PutMapping("/user/{userId}")
    public void updateUser(@RequestBody User user,@PathVariable int userId) {
    }

    @DeleteMapping("/user/{userId}")
    public void deleteById(@PathVariable long userId) {
    }
}
