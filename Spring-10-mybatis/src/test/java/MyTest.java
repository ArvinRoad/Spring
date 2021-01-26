import com.Demo.mapper.UserMapper;
import com.Demo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test() throws IOException{
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);

        SqlSessionFactory SessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = SessionFactory.openSession(true);

        //返回用户
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();

        //查询返回结果
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
