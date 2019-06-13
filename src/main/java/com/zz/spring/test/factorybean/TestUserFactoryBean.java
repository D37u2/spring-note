package com.zz.spring.test.factorybean;

import com.zz.spring.factorybean.UserFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhoujiong
 * @description: TestFactoryBean
 * @className: TestUserFactoryBean
 * @date: 2019/6/14 0:32
 * @Version 1.0
 */
public class TestUserFactoryBean {

    public static void main(String[] args) {

        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Spring.class);

        //Spring 初始化 可设置 activeProfiles 文件 。 SpringBoot中在application.yml配置一个参数即可
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("");
        annotationConfigApplicationContext.register();
        annotationConfigApplicationContext.refresh();

        UserFactoryBean map = (UserFactoryBean) annotationConfigApplicationContext.getBean("&userFactoryBean");

    }
}
