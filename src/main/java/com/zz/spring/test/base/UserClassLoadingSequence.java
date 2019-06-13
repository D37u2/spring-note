package com.zz.spring.test.base;

import com.zz.spring.service.impl.UserImpl;

/**
 * @author: zhoujiong
 * @description: 测试类的加载顺序
 * @className: UserClassLoadingSequence
 * @date: 2019/6/14 0:25
 * @Version 1.0
 */
public class UserClassLoadingSequence {

    private UserImpl user;

    public void query(){
        System.out.println("--------UserClassLoadingSequence-------");
    }
}
