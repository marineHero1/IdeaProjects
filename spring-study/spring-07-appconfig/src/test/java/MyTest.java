import com.yuan.config.yuanConfig;
import com.yuan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(yuanConfig.class);
        User user = context.getBean("user",User.class);
        System.out.println(user.name);
    }
}
