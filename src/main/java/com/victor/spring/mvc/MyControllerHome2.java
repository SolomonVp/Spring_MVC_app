package com.victor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyControllerHome2 {
    @RequestMapping("home2/")
    public String showFirstViewHome2 () {
        return "first-viewHome2";
    }
}
