package com.zz.spring.test.proxy;

import com.zz.spring.proxy.ProxyUtil;
import com.zz.spring.proxy.UserLogImpl;
import com.zz.spring.proxy.UserTimerImpl;
import com.zz.spring.service.IUser;
import com.zz.spring.service.impl.UserImpl;

import java.lang.reflect.Proxy;

public class TestUser {

    public static void main(String[] args) {
        /*IUser user = new UserLogImpl();

        user.query();*/

        /*IUser iuser = new UserImpl();

        UserTimerImpl userTimer = new UserTimerImpl(iuser);

        userTimer.query();*/

        IUser iuser = new UserTimerImpl(new UserImpl());

        IUser proxy = (IUser) ProxyUtil.createProxy(iuser);

        proxy.query();

    }
}
