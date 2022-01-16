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

    @RequestMapping("/askDetailsHome")
    public String askClientDetails() {
        return "ask-cl-details-view";
    }

    @RequestMapping("showDetailsHome")
    public String showClientDetails() {
        return "show-cl-details-view";
    }

}
