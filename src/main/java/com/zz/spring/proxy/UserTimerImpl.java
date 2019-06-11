package com.zz.spring.proxy;

import com.zz.spring.service.IUser;

/**
 * @author: zhoujiong
 * @description: 动态代理 聚合
 * @className: UserTimerImpl
 * @date: 2019/6/11 15:14
 */
public class UserTimerImpl implements IUser {

    private IUser user;

    public UserTimerImpl(IUser user){
        this.user = user;
    }

    @Override
    public void query() throws Throwable {
        System.out.println("--------timer-------");
        user.query();
    }

    @Override
    public String proxy(String p1) throws Throwable {

        System.out.println("--------timer-------");
        user.proxy(p1);

        return "success";
    }
}
