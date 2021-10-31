package com.yuan.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    //一个老师集合多名学生
    private List<Student> students;
}
