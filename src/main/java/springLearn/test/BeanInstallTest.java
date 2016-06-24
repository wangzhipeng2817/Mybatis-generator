package springLearn.test;

import springLearn.model.EasyBean;
import springLearn.util.BeanFactory;
import model.User;

/**
 * Created by wzp on 16-6-23.
 */
public class BeanInstallTest {

    public static void main(String[] args) {
        EasyBean easyBean = new EasyBean();
        easyBean.setFullName("model.User");
        easyBean.setName("user");
        BeanFactory factory = new BeanFactory();
        User user = (User) factory.getBean(easyBean);
        user.setUserName("wzp");
        System.out.println(user.getUserName());
    }
}
