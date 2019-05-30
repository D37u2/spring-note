package com.zz.spring.test.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author: zhoujiong
 * @description: 测试生命周期回调
 * @className: Test2
 * @date: 2019/5/23 16:09
 */
@Service
public class Test2 implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean-init-method....");
    }

}
