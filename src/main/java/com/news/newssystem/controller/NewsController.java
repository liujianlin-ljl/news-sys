package com.news.newssystem.controller;


import com.news.newssystem.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return "测试";
    }
    @RequestMapping("/test02")
    public Object test02(){
        return "login";
    }
    @RequestMapping("/news")
    public Object getNews(HttpServletRequest req){
        HttpSession session=req.getSession();
        session.setAttribute("news",newsService.findAll());
        return "redirect:/index.jsp";
    }
}
