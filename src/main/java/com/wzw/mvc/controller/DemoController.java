package com.wzw.mvc.controller;

import com.wzw.mvc.anno.WzwAutowired;
import com.wzw.mvc.anno.WzwController;
import com.wzw.mvc.anno.WzwRequestMapping;
import com.wzw.mvc.anno.WzwSecurity;
import com.wzw.mvc.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WzwSecurity(value = {"wzw", "wzw1", "wzw2"})
@WzwController
@WzwRequestMapping("/demo")
public class DemoController {


    @WzwAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/test?name=lisi
     *
     * @param request
     * @param response
     * @param name
     * @return
     */
    @WzwSecurity(value = {"wzw"})
    @WzwRequestMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response, String name) {
        return demoService.get(name);
    }
}
