package com.ysp.springannotitions;

import com.ysp.bean.Person;
import com.ysp.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestAnnotitionConfig
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 18:29
 * @Version 1.0
 **/
public class TestAnnotitionConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean = context.getBean(Person.class);
        System.out.println(bean.getAge()+ "-----"+ bean.getName());

        String[] beanNamesForType =  context.getBeanNamesForType(Person.class);
        for (String beanNameType : beanNamesForType) {
            System.out.println(beanNameType);
        }
    }
}
