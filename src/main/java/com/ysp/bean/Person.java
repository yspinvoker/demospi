package com.ysp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Person
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 18:25
 * @Version 1.0
 **/

/*
 * @Data :注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
 * @Setter：注解在属性上；为属性提供 setting 方法
 * @Getter：注解在属性上；为属性提供 getting 方法
 * @Log4j ：注解在类上；为类提供一个 属性名为log 的 log4j 日志对象
 * @NoArgsConstructor：注解在类上；为类提供一个无参的构造方法
 * @AllArgsConstructor：注解在类上；为类提供一个全参的构造方法
 **/

@Data
@AllArgsConstructor
public class Person {
    private int age;
    private String name;
    /*public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
}
