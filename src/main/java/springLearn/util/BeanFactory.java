package springLearn.util;

import springLearn.model.EasyBean;
import springLearn.model.annotation.Base;
import org.springframework.beans.BeanUtils;
import springLearn.model.annotation.EasyAutowired;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


/**
 * Created by wzp on 16-6-23.
 */
public class BeanFactory {

   /* public BeanFactory(EasyBean easyBean){
        this.easyBean = easyBean;
    }

    private volatile EasyBean easyBean;*/

    public Object getBean(EasyBean easyBean) {
        Class c = null;
        try {
            c = Class.forName(easyBean.getFullName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (c!=null) {
            if (c.isAnnotationPresent(Base.class)) {
                Annotation[] annotations = c.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation.annotationType().equals(Base.class)) {
                        Base base = (Base) annotation;
                        System.out.println("该类注册的名字为:" + base.value());
                    }
                }
            }
        }
        if (easyBean.getScope().equals("singleton")){
            return createSingleBean(c);
        }else {
            return createPrototypeBean(c);
        }

    }

    public Object createEasyBean(Class c){
        Object o = null;
        BeanUtils.instantiate(c);
        //注入Autowired类型都Bean
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){

            if (field.isAnnotationPresent(EasyAutowired.class)) {
            }
        }
        return o;
    }

    public Object createSingleBean(Class c){
        Object o = null;
        BeanUtils.instantiate(c);
        //注入Autowired类型都Bean
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){

            if (field.isAnnotationPresent(EasyAutowired.class)) {
            }
        }
        return o;
    }

    public Object createPrototypeBean(Class c){
        Object o = null;
        return o;
    }





}
