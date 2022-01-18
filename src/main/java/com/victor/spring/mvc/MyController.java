package com.victor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName"); // получаем имя работника с помощью HttpServletRequest
        empName = "Mr. " + empName;                               // изменяем имя
        model.addAttribute("nameAttribute", empName);          // добавляем измененное имя в качестве атрибута в модель
        model.addAttribute("description", " - snowboard instructor");

        return "show-emp-details-view";
    }

}
