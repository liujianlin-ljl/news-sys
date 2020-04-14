package com.news.newssystem.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 栏目
 */
@Data
@TableName("columninfo")
public class Column {
    @TableId
    private int colId;
    private String colTitle;
}
