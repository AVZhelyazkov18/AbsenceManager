package com.example.absencemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {
    @Autowired
    private DatabaseInitializer dao;
    @GetMapping("/login")
    public String loginGet(Model model) {
        model.addAttribute("login", new LoginData());
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@ModelAttribute LoginData loginData, Model model) {
        model.addAttribute(loginData);
        boolean isReg = dao.checkUserForAuthentication(loginData.getUsername(), loginData.getPassword());
        if (isReg)
            return "/";
        else
            return "login";
    }
}
