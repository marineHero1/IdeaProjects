import com.yuan.Dao.UserMapper;
import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashSet;

public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.getUserById(1);
        System.out.println(user1);
        sqlSession.clearCache();
        User user2 = mapper.getUserById(1);
        System.out.println(user2);
        //一级缓存，不再重复从数据库中获取数据
        System.out.println(user1==user2);
        sqlSession.close();
        //一级缓存知识点
        /*
        1.每个sqlSession中的缓存相互独立
        2.当前缓存中，不存在这个数据
        3.中间增删改操作可能会对当前数据产生影响，故会重复从数据库中获取数据
        4.sqlSession.clearCache();//手动清除缓存
        */

    }

    //测试二级缓存
    @org.junit.Test
    public void test2(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user1 = mapper1.getUserById(1);
        System.out.println(user1);
        sqlSession1.close();

        User user2 = mapper2.getUserById(1);
        System.out.println(user2);
        //二级缓存，不再重复从数据库中获取数据
        System.out.println(user1==user2);
        sqlSession2.close();
        /*一级缓存知识点
        1.每个sqlSession中的缓存相互独立
        2.当前缓存中，不存在这个数据
        3.中间增删改操作可能会对当前数据产生影响，故会重复从数据库中获取数据
        4.sqlSession.clearCache();//手动清除缓存
        */
        /*二级缓存知识点
        只要开启了二级缓存，我们在同一个Mapper中的查询，可以在二级缓存中拿到数据
        查出的数据都会被默认先放在一级缓存中
        只有会话提交或者关闭以后，一级缓存中的数据才会转到二级缓存中
        */

    }

    @org.junit.Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(9,"321","123456");
        mapper.addUser(user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();


    }
}
