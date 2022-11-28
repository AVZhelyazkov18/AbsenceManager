package com.example.absencemanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String Page1(@RequestParam(name = "username", required = false) String username, @RequestParam(name = "password", required = false) String password, Model model) {
        if (username != null && password != null) {
            Integer ans = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM USERS WHERE Username=? AND Password=?", new Object[]{username, password}, Integer.class);
            if (ans == 1) {
                model.addAttribute("username", username);
                return "index";
            } else {
                model.addAttribute("IsNotCorrect", true);
                return "login";
            }
        }
        return "index";
    }


    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/registerpage")
    public String registerPage() {
        return "register";
    }
}
