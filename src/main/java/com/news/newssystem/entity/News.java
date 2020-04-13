package com.news.newssystem.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("news")
public class News {
    @TableId
    private int nId;
    //标题
    private String nTitle;
    //内容
    private String nContent;
    //栏目
    private int colId;
    private int uId;
    private String time;
    @TableField(exist = false)
    private String nickName;//作者
}
