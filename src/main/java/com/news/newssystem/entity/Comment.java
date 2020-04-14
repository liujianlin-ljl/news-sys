package com.news.newssystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 评论
 */
@Data
@TableName("commentinfo")
public class Comment {
    @TableId
    private int cId;
    private String cContent;
    private String cCreattime;
    private int uId;
    private int nId;
}
