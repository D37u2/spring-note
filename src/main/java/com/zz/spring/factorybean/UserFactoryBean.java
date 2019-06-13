package com.zz.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: zhoujiong
 * @description: 测试FactoryBean
 * @className: UserFactoryBean
 * @date: 2019/6/14 0:15
 * @Version 1.0
 */
@Component("userFactoryBean")
public class UserFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new HashMap<>();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
