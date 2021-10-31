package com.springboot.chapter2.config;

import com.springboot.chapter2.pojo.BussinessPerson;
import com.springboot.chapter2.pojo.User;
import com.springboot.chapter2.pojo.definition.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class IoCTest {
    private static Logger log = Logger.getLogger(IoCTest.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

//        User user = ctx.getBean(User.class);
//        log.info(user.getId()+"");
        //默认直接进行实例化和依赖注入
        Person person = ctx.getBean(BussinessPerson.class);
        person.service();
        ctx.close();


    }
}
