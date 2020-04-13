package com.news.newssystem.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.news.newssystem.entity.News;
import com.news.newssystem.entity.User;
import com.news.newssystem.service.NewsService;
import com.news.newssystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){

        return newsService.findAll();
    }
    @RequestMapping("/test02")
    public Object test02(){
        return "login";
    }
    @RequestMapping("/list")
    public Object getNews(HttpServletRequest req){
        HttpSession session=req.getSession();
        session.setAttribute("news",newsService.list());
        return "redirect:/index.jsp";
    }

    @RequestMapping("/list/{col_id}")
    @ResponseBody
    public Object getNewsByColId(@PathVariable("col_id") int col){
        QueryWrapper<News> wrapper=new QueryWrapper<>();
        wrapper.eq("col_id",col);
        List<News> newsList= newsService.list(wrapper);
        for(News news:newsList){
            QueryWrapper<User> userWrapper=new QueryWrapper<>();
            userWrapper.select("u_name").eq("u_id",news.getUId());
            User user = userService.getOne(userWrapper);
            news.setNickName(user.getUName());
        }
        return newsList;
    }
}
