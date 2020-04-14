package com.news.newssystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.news.newssystem.entity.Column;
import com.news.newssystem.mapper.ColumnMapper;
import com.news.newssystem.service.ColunmService;
import org.springframework.stereotype.Service;

@Service
public class ColumnServiceImpl extends ServiceImpl<ColumnMapper, Column> implements ColunmService {
}
