package com.victor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("showDetails")
    public String showEmpDetails() {
        return "show-emp-details-view";
    }

    @RequestMapping("/askClient")
    public String askClient() {
        return "ask-client-view";
    }

    @RequestMapping("showClient")
    public String showClient() {
        return "show-client-view";
    }

}
