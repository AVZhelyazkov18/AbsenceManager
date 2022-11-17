package com.example.absencemanager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
    @GetMapping("/")
    public void method(@RequestParam(name="username", required = false, defaultValue = "none") String name) {
        String msg = "Hello " + name;
    }
}
