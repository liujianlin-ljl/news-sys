package com.news.newssystem.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.news.newssystem.entity.Column;
import com.news.newssystem.entity.News;
import com.news.newssystem.service.ColunmService;
import com.news.newssystem.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
//    @Autowired
//    private ColunmService colunmService;
//    @Autowired
//    private NewsService newsService;
//    @RequestMapping("/")
//    public String index(HttpServletRequest request){
//        HttpSession session=request.getSession();
//        List<Column> columnList = colunmService.list();
//        List<News> newsList = newsService.list(new QueryWrapper<News>().eq("col_id", 1));
//        String jsonStr=JSON.toJSONString(columnList);
//        session.setAttribute("colList",columnList);
//        request.setAttribute("newsList",newsList);
//        System.out.println(jsonStr);
//        System.out.println(newsList);
//        return "index";
//    }

}
