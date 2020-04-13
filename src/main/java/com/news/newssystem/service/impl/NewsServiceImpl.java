package com.news.newssystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.news.newssystem.entity.News;
import com.news.newssystem.mapper.NewsMapper;
import com.news.newssystem.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper,News> implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.findAll();
    }
}
