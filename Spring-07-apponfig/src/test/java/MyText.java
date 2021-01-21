import com.Demo.config.dConfig;
import com.Demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyText {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(dConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
