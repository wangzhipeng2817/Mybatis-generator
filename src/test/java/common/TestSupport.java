package common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wzp on 16-6-24.
 */
@ContextConfiguration(locations = "classpath:spring-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSupport {

    @Test
    public void jenkinsTest(){
        System.out.println("test");
    }
}
