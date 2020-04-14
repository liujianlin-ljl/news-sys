package com.news.newssystem.controller;

import com.news.newssystem.entity.Column;
import com.news.newssystem.service.ColunmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/col")
public class ColumnController {

    @Autowired
    private ColunmService colunmService;

    @RequestMapping("/list")
    @ResponseBody
    public Object getColumn(){
       return colunmService.list();
    }
}
