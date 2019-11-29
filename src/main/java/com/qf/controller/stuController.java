package com.qf.controller;

import com.qf.dao.stuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class stuController {
    @Autowired
    stuMapper stu ;
    @RequestMapping("/hello")
    public List stui(){
return stu.liststu();
    }
}
