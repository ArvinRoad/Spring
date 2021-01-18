import com.Demo.dao.UserDaoImpl;
import com.Demo.dao.UserDaoMysqlImpl;
import com.Demo.dao.UserDaoSqlserverImpl;
import com.Demo.dao.UserOracleImpl;
import com.Demo.service.UserService;
import com.Demo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText {
    public static void main(String[] args){
        //获取ApplicationContext,拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //需要什么直接get。
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

        //用户实际调用的是业务层，Dao层他们不需要接触
      /* UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoSqlserverImpl());
       userService.getUser();
       我们不再需要new一个对象
       */
    }
}
