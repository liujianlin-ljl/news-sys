package com.news.newssystem.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.news.newssystem.entity.User;
import com.news.newssystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    public void test(){
        List<User> userList = userService.list();
        for (User user:userList) {
            System.out.println(user);
        }
    }
    @RequestMapping("list")
    @ResponseBody
    public Object getUser(){
       return userService.list();
    }

    @RequestMapping("list/{id}")
    @ResponseBody
    public Object getUserById(@PathVariable("id")int id){
        return userService.list(new QueryWrapper<User>().eq("u_id",id));
    }
}
