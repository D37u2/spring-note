package com.zz.spring.test.bean.init;


import com.zz.analyse.bean.init.AnnotationConfigApplicationContext;
import com.zz.analyse.bean.init.service.UserServiceInit;

/**
 * @author: zhoujiong
 * @description: 测试bean的初始化
 * @className: TestBeanInit
 * @date: 2019/6/14 13:27
 */
public class TestBeanInit {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();


        //扫描
        annotationConfigApplicationContext.scan("com.zz.analyse.bean.init.service");
        //注册
        annotationConfigApplicationContext.register();

        System.out.println(annotationConfigApplicationContext.getBean(UserServiceInit.class));
        //刷新
        //annotationConfigApplicationContext.refresh();

        //System.out.println(annotationConfigApplicationContext.getBean("userServiceInit"));

    }
}
