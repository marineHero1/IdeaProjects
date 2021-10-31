package com.yuan.Dao;

import com.yuan.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> selectBlogs(Map map);

    int updateBlog(Map map);
}
