package com.zz.spring.factorybean;

import com.zz.spring.service.impl.UserImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: zhoujiong
 * @description: 测试FactoryBean
 * @className: UserFactoryBean
 * @date: 2019/6/14 0:15
 * @Version 1.0
 */
public class UserFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new UserImpl();
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
