package com.news.newssystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.news.newssystem.entity.Comment;
import com.news.newssystem.mapper.CommentMapper;
import com.news.newssystem.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
}
