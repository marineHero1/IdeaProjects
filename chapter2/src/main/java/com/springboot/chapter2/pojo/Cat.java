package com.springboot.chapter2.pojo;

import com.springboot.chapter2.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【"+Cat.class.getSimpleName()+"】是抓老鼠。");
    }
}
