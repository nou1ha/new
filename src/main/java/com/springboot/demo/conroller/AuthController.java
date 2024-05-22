package com.springboot.demo.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Return the name of your login page template (e.g., login.html)
    }

    @GetMapping("/logout")
    public String logout() {
        // Perform logout operations if needed
        return "redirect:/login?logout"; // Redirect back to the login page with a logout parameter
    }
}
