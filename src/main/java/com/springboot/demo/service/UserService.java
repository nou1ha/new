package com.springboot.demo.service;

import com.springboot.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    public User saveuser (User user );
    public List<User> getAlluser ();

}
