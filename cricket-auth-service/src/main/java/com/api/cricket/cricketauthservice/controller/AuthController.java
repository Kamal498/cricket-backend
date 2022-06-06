package com.api.cricket.cricketauthservice.controller;

import com.api.cricket.cricketauthservice.model.AuthRequest;
import com.api.cricket.cricketauthservice.model.User;
import com.api.cricket.cricketauthservice.service.UserService;
import com.api.cricket.cricketauthservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Cricket App !!";
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return userService.saveUserToRepository(user);
    }

    @PostMapping("/login")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username or password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
}
