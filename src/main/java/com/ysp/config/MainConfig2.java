package com.ysp.config;

import com.ysp.bean.Color;
import com.ysp.bean.Person;
import com.ysp.bean.Red;
import com.ysp.condition.LinuxCondition;
import com.ysp.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @ClassName MainConfig
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 18:26
 * @Version 1.0
 **/

@Configuration
/*@ComponentScan(basePackages = "com.ysp", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
* */

/*
@ComponentScan(basePackages = "com.ysp", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})}, useDefaultFilters = false )
*/

/*@ComponentScans(value = {@ComponentScan(basePackages = "com.ysp", includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class})}, useDefaultFilters = false)
} )*/


@ComponentScans(value = {@ComponentScan(basePackages = "com.ysp",  useDefaultFilters = false)
} )

/**
 * @ComponentScan 指定要扫描的包
 * excludeFilters = Filter[], 指定扫描的时候按照什么规则排除那些组件
 *


 **/
@Import(value = {Red.class, Color.class})
public class MainConfig2 {

    //给容器注册一个person Bean  id 为方法名
    /*
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE prototype
     * ioc容器启动时并不去创建对象，每次获取的时候才会调用创建对象
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON singleton
     * Ioc容器启动时调用方法创建对象放到ioc容器中，以后每次获取直接从容器中拿
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     **/
    /**
     * 懒加载:
     *  单实例bean，默认在容器启动的时候创建对象
     *  懒加载：容器启动的时候不创建对象，第一次使用的bean创建对象
     * **/

    //@Scope("singleton")
    @Lazy
    @Bean(value = "person2")
    public Person person() {
        return new Person(15,"tom");
    }


    @Conditional(WindowsCondition.class)
    @Bean(value = "bill")
    public Person person01() {
        return new Person(15,"bill");
    }

    @Conditional(LinuxCondition.class)
    @Bean(value = "linus")
    public Person person02() {
        return new Person(45,"linus");
    }
}
