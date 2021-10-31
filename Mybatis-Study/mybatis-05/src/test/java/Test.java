import com.yuan.Dao.StudentMapper;
import com.yuan.Dao.TeacherMapper;
import com.yuan.pojo.Student;
import com.yuan.pojo.Teacher;
import com.yuan.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @org.junit.Test
    public void testGetStudents(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for(Student student :students){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
