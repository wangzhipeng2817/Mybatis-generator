package common;

import model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by wzp on 16-6-24.
 */
public class SingletonTest extends TestSupport{


    @Autowired
    private User user1;

    @Autowired
    private  User user2;

    @Test
    public void singletonTest(){

        Assert.assertNotEquals(user1,user2);

    }
}
