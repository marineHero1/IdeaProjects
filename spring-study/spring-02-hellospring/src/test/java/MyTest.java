import com.yuan.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象！，拿到spring的容易
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有
        //我们的对象都在spring中管理，使用的时候从中取出
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
