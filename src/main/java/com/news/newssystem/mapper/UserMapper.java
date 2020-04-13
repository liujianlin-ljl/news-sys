package com.news.newssystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.news.newssystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
