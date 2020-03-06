package com.yqwl.ly.controller;

import com.yqwl.ly.annotation.MyAutowired;
import com.yqwl.ly.annotation.MyController;
import com.yqwl.ly.annotation.MyRequestMapping;
import com.yqwl.ly.annotation.MyRequestParam;
import com.yqwl.ly.service.DemoServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MyController
@MyRequestMapping("/user")
public class UserController {

    @MyAutowired
    DemoServiceImpl demoService;

    @MyRequestMapping("query")
    public void query(HttpServletRequest req, HttpServletResponse resp,
                      @MyRequestParam("name")String name,
//                      @MyRequestParam("id") int id,
                      @MyRequestParam("addr") String addr){

        String s = demoService.get(name,addr);
        try {
            resp.getWriter().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
