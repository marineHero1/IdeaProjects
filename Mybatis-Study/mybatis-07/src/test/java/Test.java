import com.yuan.Dao.BlogMapper;
import com.yuan.pojo.Blog;
import com.yuan.utils.IDUtils;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.close();

    }

    @org.junit.Test
    public void testSelect(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","Java如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.selectBlogs(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();

    }

    @org.junit.Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String> map = new HashMap<>();
        map.put("title","Java确实简单a");
        map.put("author","俺要说a");
        map.put("id","9e9c972b751945209b5d83a30987ff4e");
        mapper.updateBlog(map);
        sqlSession.close();


    }
}
