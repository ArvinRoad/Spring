import com.Demo.pojo.User;
import com.Demo.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
        //User user = new User();

        //Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationComtext.xml");

        //两个User是同一个，说明其内存中只要一份实例。
        UserT user = (UserT) context.getBean("user2");
        /*User user2 =(User) context.getBean("user");
        System.out.println(user == user2);*/
        user.show();
    }
}
