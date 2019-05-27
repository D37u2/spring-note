package com.zz.spring.testInitBean;


import org.springframework.stereotype.Service;

/**
 * @author: zhoujiong
 * @description: 测试生命周期回调
 * @className: Test
 * @date: 2019/5/23 16:09
 */
@Service
public class Test {

    //1、实现InitializingBean 或者 DisposableBean 重写 afterPropertiesSet()和 destroy()

    //2、默认初始化和销毁方法 使用xml 中 default-init-method 指定init 方法

    public void init(){
        System.out.println("default-init-method....");
    }

    //3、使用@PostConstruct 或者@PreDestroy


}
