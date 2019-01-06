package com.ysp.serializable;

import java.io.*;

/**
 * @ClassName TestSerial
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 17:10
 * @Version 1.0
 **/
public class TestSerial implements Serializable {

    public byte version = 100;

    public byte count = 0;
        public static void main(String args[]) throws IOException, ClassNotFoundException {
/*
                FileOutputStream fos = new FileOutputStream("temp.out");

                ObjectOutputStream oos = new ObjectOutputStream(fos);

                TestSerial ts = new TestSerial();

                oos.writeObject(ts);

                oos.flush();

                oos.close();*/

            FileInputStream fis = new FileInputStream("temp.out");

            ObjectInputStream oin = new ObjectInputStream(fis);

            TestSerial ts = (TestSerial) oin.readObject();

            System.out.println("version="+ts.version);
        }
}
