package com.springboot.chapter2.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springboot.chapter2.*", lazyInit = true)
public class AppConfig {
}
