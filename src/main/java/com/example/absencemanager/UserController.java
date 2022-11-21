package com.example.absencemanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/")
    public String indexPage() {
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

    @GetMapping(value="/log-in")
    public String getFields(@ModelAttribute User user, Model model) {
        model.addAttribute("loggedUser", user.getUsername());
        System.out.println("yes");
        return "index";
    }
}
