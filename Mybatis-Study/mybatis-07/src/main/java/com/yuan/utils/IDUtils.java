package com.yuan.utils;

import org.junit.Test;

import java.util.UUID;

public class IDUtils {
    public static String genId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
    }
}
