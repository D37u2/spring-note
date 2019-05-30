package com.zz.spring;

import com.zz.spring.config.Spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhoujiong
 * @description: Spring 测试启动
 * @className: TestApplication
 * @date: 2019/5/23 16:19
 */
public class TestApplication {

    public static void main(String[] args) {

        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);


        String tesst = "1-1000|2-1500|3-2000|";

        String[] a = tesst.split("\\-");

        System.out.println(a);
    }
}
