package com.shopme.shopmebackend.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String viwHomePage(){
        return "index";
    }
}
