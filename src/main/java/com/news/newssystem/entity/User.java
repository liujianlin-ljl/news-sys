package com.news.newssystem.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体
 */
@Data
@TableName("userinfo")
public class User {
    @TableId
    private int uId;
    private String uName;
    private String uPsd;
    private String uNickname;
    private int uStatus;
    private String uCreatedate;
}
