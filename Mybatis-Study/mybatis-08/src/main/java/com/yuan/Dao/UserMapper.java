package com.yuan.Dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据id查询用户
    User getUserById(int id);
    int addUser(User user);
}
