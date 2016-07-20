package common;

import client.UserClient;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.UserService;

/**
 * Created by wzp on 16-6-27.
 */
public class ClientTest extends TestSupport {
    @Test
    public void easyTest(){
        System.out.println("for the jenkins");
    }
}
