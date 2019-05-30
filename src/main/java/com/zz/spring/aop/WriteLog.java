package com.zz.spring.aop;

import com.zz.spring.bean.Aop;
import com.zz.spring.bean.TestAop2;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WriteLog{

    @DeclareParents(value="com.zz.spring.controller.*", defaultImpl=TestAop2.class)
    public static Aop aop;

    @Before("this(aop)")
    public void recordUsage(Aop aop) {
        /*System.out.println("test DeclareParents");
        aop.query();*/
    }

    /**
     * this 和 target 区别
     *
     * this 指当前对象（即代理对象）是否等于 com.zz.spring.bean.TestAop。是不可能会等于的
     *
     * target 指目标对象是否等于 com.zz.spring.bean.TestAop。 是一定会等于的
     *
     */
    /*@Pointcut("within(com.zz.spring.bean.TestAop)")
    public void writeLog(){}*/

    /*@Before("writeLog()")
    public void before(JoinPoint joinPoint){
        System.out.println("before");

        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getArgs());
    }*/

   /* @Around("writeLog()")
    public void around(){
        System.out.println("around");
    }*/

    /*@After("writeLog()")
    public void after(){
        System.out.println("after");
    }*/

}
