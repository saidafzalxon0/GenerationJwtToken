package com.example.JWT.controller;

import com.example.JWT.dto.LoginDto;
import com.example.JWT.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    JWTService jwtService;

    @GetMapping
    public String get(@RequestBody LoginDto loginDto){
        return jwtService.generaterKey(loginDto);
    }
}
