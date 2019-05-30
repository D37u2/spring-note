package com.zz.spring.test.proxy;


import com.zz.spring.entity.CityEntity;
import sun.misc.ProxyGenerator;

import java.io.*;

/**
 * @author: zhoujiong
 * @description: 动态代理测试
 * @className: TestProxy
 * @date: 2019/5/29 16:39
 *
 * https://www.cnblogs.com/techyc/p/3455950.html
 */
public class TestProxy {

    public static void main(String[] args) {

        Class<?>[] intefaces = new Class[]{CityEntity.class};

        byte[] bytes = ProxyGenerator.generateProxyClass("city",intefaces);

        File file = new File("E:\\CityEntity.class");

        try {
            FileOutputStream writer = new FileOutputStream(file);

            writer.write(bytes);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Proxy.newProxyInstance();
    }

}
