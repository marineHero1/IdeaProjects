import com.yuan.pojo.Student;
import com.yuan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        User user1 = context.getBean("user",User.class);
        User user2 = context.getBean("user",User.class);
        System.out.println(user1==user2);
    }

}
