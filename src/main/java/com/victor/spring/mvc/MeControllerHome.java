package com.victor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeControllerHome {
    @RequestMapping("home/")
    public String showViewHome() {
        return "first-viewHome";
    }
}
