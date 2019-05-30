package com.zz.spring.test.aop;

import com.zz.spring.bean.Aop;
import com.zz.spring.config.Spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAop {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);

        Aop testAop = (Aop) annotationConfigApplicationContext.getBean("testAop");

        if(testAop instanceof com.zz.spring.bean.Aop){

            System.out.println("11111111111");
        }
        testAop.query();

    }
}
