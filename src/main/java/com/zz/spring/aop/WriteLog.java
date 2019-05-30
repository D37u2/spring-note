package com.zz.spring.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WriteLog{

    /**
     * this 和 target 区别
     *
     * this 指当前对象（即代理对象）是否等于 com.zz.spring.bean.TestAop。是不可能会等于的
     *
     * target 指目标对象是否等于 com.zz.spring.bean.TestAop。 是一定会等于的
     *
     */
    @Pointcut("target(com.zz.spring.bean.TestAop)")
    public void writeLog(){}

    @Before("writeLog()")
    public void before(){
        System.out.println("before");
    }

    @Around("writeLog()")
    public void around(){
        System.out.println("around");
    }

    @After("writeLog()")
    public void after(){
        System.out.println("after");
    }

}
