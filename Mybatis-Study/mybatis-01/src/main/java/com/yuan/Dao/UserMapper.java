package com.yuan.Dao;

import com.yuan.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //插入用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
    //根据用户名和密码查找用户
    User selectUserByNameAndPwd(@Param("userName") String userName, @Param("pwd") String pwd);
    //根据用户名和密码查找用户 通过Map传入
    User selectUserByNameAndPwd(Map<String,Object> map);
    //模糊查询
    List<User> selectLike(String name);
}
