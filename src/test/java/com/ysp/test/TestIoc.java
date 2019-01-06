package com.ysp.test;

import com.ysp.bean.Person;
import com.ysp.config.MainConfig;
import com.ysp.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestIoc
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 18:44
 * @Version 1.0
 **/
public class TestIoc {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames   = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        Object bean = context.getBean("person2");
        Object bean2 = context.getBean("person2");
        System.out.println(bean == bean2);
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[]  beanNamesForType = context.getBeanNamesForType(Person.class);
        //ConfigurableEnvironment environment = context.getEnvironment();
        for (String  bean:beanNamesForType) {
            System.out.println(bean);
        }
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[]  beanNamesForType = context.getBeanDefinitionNames();
        //ConfigurableEnvironment environment = context.getEnvironment();
        for (String  bean:beanNamesForType) {
            System.out.println(bean);
        }
    }
}
