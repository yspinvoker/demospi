package com.ysp.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName WindowsCondition
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 19:29
 * @Version 1.0
 **/
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //能获取到ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();

        //获取到bean定义的注册类
        BeanDefinitionRegistry beanDefinitionRegistry = context.getRegistry();

        //获取到bean注册的环境
        Environment environment =  context.getEnvironment();

        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
