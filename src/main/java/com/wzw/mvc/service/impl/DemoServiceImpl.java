package com.wzw.mvc.service.impl;

import com.wzw.mvc.anno.WzwService;
import com.wzw.mvc.service.IDemoService;

@WzwService("demoService")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String get(String name) {
        System.out.println("service 实现类中的name参数：" + name);
        return name;
    }
}
