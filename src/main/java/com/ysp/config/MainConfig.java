package com.ysp.config;

import com.sun.tools.internal.jxc.gen.config.Classes;
import com.ysp.bean.Person;
import com.ysp.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

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


@ComponentScans(value = {@ComponentScan(basePackages = "com.ysp", includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})}, useDefaultFilters = false)
} )

/**
 * @ComponentScan 指定要扫描的包
 * excludeFilters = Filter[], 指定扫描的时候按照什么规则排除那些组件
 *


 **/

public class MainConfig {

    //给容器注册一个person Bean  id 为方法名
    @Bean(value = "person2")
    public Person person() {
        return new Person(15,"tom");
    }
}
