import com.yuan.Dao.UserMapper;
import com.yuan.pojo.User;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void getUsers(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        User user = mapper.getUserById(4);
//        System.out.println(user);
//        mapper.addUser(new User(6,"sister","123456"));
//        mapper.updateUser(new User(6,"brother","123"));
        //mapper.deleteUser(6);

        sqlSession.close();

    }
}
