import com.lyw.dao.JsonDao;
import com.lyw.po.Json;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import java.io.IOException;
import java.io.InputStream;
public class Test {
    private InputStream is;
    private SqlSessionFactory sqlSessionFactory;
    private  SqlSession sqlSession;
    private JsonDao js;
    @Before
    public void before() throws IOException {
        //加载配置文件
        is= Resources.getResourceAsStream("mybatis-config.xml");
        //创建sqlSessionFactory工厂
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取会话对象
        sqlSession = sqlSessionFactory.openSession(true);
         js= sqlSession.getMapper(JsonDao.class);
    }
    @org.junit.Test
    public void test() throws IOException {
        //查询全部
        js.selectAll().forEach(System.out::println);
    }
    @org.junit.Test
    //根据id查询
    public void testselectOne() throws IOException {

        Json json = js.selectOne(5);
        System.out.println(json);
    }
    //增加
    @org.junit.Test
    public void testinsert() throws IOException {

      Json jss=new Json("hsh","nan");
        int insert = js.insert(jss);
        System.out.println("insert = " + insert);
    }
    //删除
    @org.junit.Test
    public void testdelete() throws IOException {
        int delete = js.delete(9);
        System.out.println("delete = " + delete);

    }
    //修改
    @org.junit.Test
    public void testupdate() throws IOException {
      Json jss=new Json();
      jss.setId(2);
      jss.setName("李四");
      jss.setSex("女");
        int update = js.update(jss);
        System.out.println("update = " + update);
    }
}