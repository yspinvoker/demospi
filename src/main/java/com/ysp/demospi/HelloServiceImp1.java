package com.ysp.demospi;

/**
 * @ClassName HelloServiceImp1
 * @Description 定义接口
 * @Author mesos
 * @Date 2018/12/30 16:37
 * @Version 1.0
 **/
public class HelloServiceImp1 implements HelloService{
    @Override
    public void hello() {
        System.out.println("HelloServiceImp1");
    }
}
