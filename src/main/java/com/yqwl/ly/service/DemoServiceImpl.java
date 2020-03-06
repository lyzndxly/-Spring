package com.yqwl.ly.service;

import com.yqwl.ly.annotation.MyService;
import com.yqwl.ly.service.Iservice.IDemoService;

@MyService
public class DemoServiceImpl implements IDemoService {
    @Override
    public String get(String name) {
        return "My name is "+name;
    }

    @Override
    public String get(String name,  String addr) {
        return "My name is "+name+" ,My 住址 is "+addr;
    }
}
