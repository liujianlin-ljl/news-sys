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
        QueryWrapper<News> wrapper=new QueryWrapper<News>();
        wrapper.eq("col_id",1);
        return newsService.list(wrapper);
    }
    @RequestMapping("/list")
    public Object getNews(HttpServletRequest req){
        HttpSession session=req.getSession();
        session.setAttribute("news",newsService.list());
        return "redirect:/index.jsp";
    }

    /**
     * 根据栏目获取新闻列表
     * @param col
     * @return
     */
    @RequestMapping("/list/{col_id}")
    @ResponseBody
    public Object getNewsByColId(@PathVariable("col_id") int col){
        QueryWrapper<News> wrapper=new QueryWrapper<>();
        wrapper.eq("col_id",col);
//                .select(News.class,info->info.getColumn().equals("n_id")
//                        && info.getColumn().equals("n_title")
//                        &&info.getColumn().equals("time"));
        List<News> newsList= newsService.list(wrapper);
        newsList.forEach(System.out::println);
        return newsList==null ? "请求错误" : newsList;
    }

    /**
     * 阅读新闻，根据新闻id查询一条新闻
     * @param id
     * @return
     */
    @RequestMapping("/read/{id}")
    public String getNewsById(@PathVariable("id") int id,HttpServletRequest request){
        //条件构造器：根据新闻id查询
        QueryWrapper<News> wrapper=new QueryWrapper<>();
        wrapper.eq("n_id",id);
        News news= newsService.getOne(wrapper);
        QueryWrapper<User> userWrapper=new QueryWrapper<>();
        userWrapper.select("u_name").eq("u_id",news.getUId());
        User user = userService.getOne(userWrapper);
        news.setNickName(user.getUName());
        request.setAttribute("news",news);
        System.out.println("新闻："+news.getTitle());
        return "newspages/news_read";
    }

}
