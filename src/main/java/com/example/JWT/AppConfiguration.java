package com.example.JWT;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class AppConfiguration {

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
