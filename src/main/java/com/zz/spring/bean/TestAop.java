package com.zz.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class TestAop implements Aop{

    @Override
    public void query(){
        System.out.println("query");
    }
}
