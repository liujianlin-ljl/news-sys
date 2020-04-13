package com.news.newssystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.news.newssystem.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper extends BaseMapper<News> {
    @Select("select n.n_id nId,n.n_title nTitle,n.n_content nContent, n.col_id colId,time,u.u_name nickName " +
            "from news n,userinfo u where n.u_id=u.u_id")
    List<News> findAll();
}
