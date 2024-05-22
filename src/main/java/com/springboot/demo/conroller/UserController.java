package com.springboot.demo.conroller;


import com.springboot.demo.model.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveuser(user);
        return "New user Added";
    }

    @GetMapping("/getAll")
    public List<User> getAlluser(){
        return userService.getAlluser();
    }
}
