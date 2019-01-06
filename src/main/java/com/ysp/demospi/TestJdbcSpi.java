package com.ysp.demospi;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/**
 * @ClassName TestJdbcSpi
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 16:48
 * @Version 1.0
 **/
public class TestJdbcSpi {
    public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        Driver driver;
        while (drivers.hasMoreElements())
        {
            driver = drivers.nextElement();
            System.out.println(driver.getClass() + "------" + driver.getClass().getClassLoader());
        }
        System.out.println(DriverManager.class.getClassLoader());

    }
}
