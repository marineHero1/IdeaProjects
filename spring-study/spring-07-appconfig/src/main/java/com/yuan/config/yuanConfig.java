package com.yuan.config;

import com.yuan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class yuanConfig {
    @Bean
    public User user(){
        return new User();
    }
}
