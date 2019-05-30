package com.zz.spring.test.bean;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: zhoujiong
 * @description: 测试生命周期回调
 * @className: Test2
 * @date: 2019/5/23 16:09
 */
@Service
public class Test3 {

    @PostConstruct
    public void useAnnotationInit(){
        System.out.println("@PostConstruct");
    }

    @PreDestroy
    public void useAnnotationDestory(){
        System.out.println("@PostConstruct");
    }
}
