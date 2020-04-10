package com.news.newssystem.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_news")
public class News {

    private int id;
    private String title;
    private String content;
    private int type;
    private String status;
}
