package com.zz.analyse.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: zhoujiong
 * @description: TODO
 * @className: DaoFactoryBean
 * @date: 2019/6/13 17:11
 */
@Component("daoFactoryBean")
public class DaoFactoryBean implements FactoryBean {

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
