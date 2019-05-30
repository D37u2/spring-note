package com.zz.spring.test.aop;

import com.zz.spring.bean.Aop;
import com.zz.spring.config.Spring;
import com.zz.spring.controller.TestAopController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);

        Aop testAop = (Aop) annotationConfigApplicationContext.getBean("testAopController");

        testAop.query();

    }
}
