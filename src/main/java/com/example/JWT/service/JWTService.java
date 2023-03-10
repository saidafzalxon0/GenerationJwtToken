package com.example.JWT.service;

import com.example.JWT.dto.LoginDto;
import com.google.gson.Gson;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Setter;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JWTService {
//    @Value("${spring.security.secret.key}")
    private String key = "443987493fiojfakl";

    @Autowired
    Gson gson;


    public String generaterKey(LoginDto loginDto){
        return Jwts.builder()
                .setSubject(gson.toJson(loginDto))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 2 * 2))
                .signWith(SignatureAlgorithm.HS256,key)
                .compact();
    }


}
