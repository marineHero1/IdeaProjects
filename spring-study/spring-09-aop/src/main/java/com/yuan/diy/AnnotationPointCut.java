package com.yuan.diy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.yuan.service.UserServiceImpl.*(..))")
    public void before(JoinPoint jp){
        Signature signature = jp.getSignature();
        System.out.println("====注解方式下，"+signature.getName()+"方法执行前====");
    }

    @After("execution(* com.yuan.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====注解方式下，方法执行后====");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.yuan.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = jp.proceed();
        Signature signature = jp.getSignature();
        //System.out.println(proceed);
        //System.out.println("jp的签名,执行的方法名是："+signature.getName());
        System.out.println("环绕后");
    }
}
