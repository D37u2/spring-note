package com.zz.spring.proxy;

import com.zz.spring.service.impl.UserImpl;

/**
 * @author: zhoujiong
 * @description: 动态代理 继承
 * @className: UserLogImpl
 * @date: 2019/6/11 15:14
 */
public class UserLogImpl extends UserImpl {

    /**
     * @Author zhoujiong
     * @Description TODO
     * @Param []
     * @return void
     * @Date 2019/6/11 10:55
     */
    @Override
    public void query() {
        System.out.println("------log-------");
        super.query();
    }
}
