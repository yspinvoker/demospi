package com.ysp.demospi;

import java.util.ServiceLoader;

/**
 * @ClassName Test
 * @Description spi练习
 * @Author mesos
 * @Date 2018/12/30 16:40
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        ServiceLoader<HelloService> loaders = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : loaders) {
            helloService.hello();
        }

    }
}
