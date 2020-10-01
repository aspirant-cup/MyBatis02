import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @outhor LiYouWei
 * @create 2020/10/1-9:32
 */
public class Test02 {
    @Before
    public void before(){
        System.out.println("Test02.before");
    }
    @Test
    public void test(){
        System.out.println("Test02.test");
    }
    @After
    public void after(){
        System.out.println("Test02.after");
    }
}
