package com.sbs.demo5.domain.home.conteoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showMain() {
        return "usr/home/main";
    }
}
