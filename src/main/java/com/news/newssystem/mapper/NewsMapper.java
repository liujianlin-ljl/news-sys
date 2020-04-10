package com.news.newssystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.news.newssystem.entity.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper extends BaseMapper<News> {
}
