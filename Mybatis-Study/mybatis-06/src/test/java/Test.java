import com.yuan.Dao.TeacherMapper;
import com.yuan.pojo.Teacher;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher1 = mapper.getTeacher2(1);
        System.out.println(teacher1);
        sqlSession.close();

    }
}
