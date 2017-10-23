package com.lyap.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/page1.htm")
    public String page1() {
        return "page1";
    }

    @RequestMapping("/page2.htm")
    public String page2() {
        return "page2";
    }

    @RequestMapping("/page3.htm")
    public String page3() {
        return "page3";
    }

}
