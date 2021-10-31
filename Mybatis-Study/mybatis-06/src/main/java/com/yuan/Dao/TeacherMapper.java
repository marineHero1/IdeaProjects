package com.yuan.Dao;

import com.yuan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    Teacher getTeacher(@Param("id") int id);
    Teacher getTeacher2(@Param("id") int id);
}
