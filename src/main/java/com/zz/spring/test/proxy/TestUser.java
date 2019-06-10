package com.zz.spring.test.proxy;

import com.zz.spring.proxy.UserTimerImpl;
import com.zz.spring.service.IUser;
import com.zz.spring.service.impl.UserImpl;

public class TestUser {

    public static void main(String[] args) {
        /*IUser user = new UserLogImpl();

        user.query();*/

        IUser iuser = new UserImpl();

        UserTimerImpl userTimer = new UserTimerImpl(iuser);

        userTimer.query();
    }
}
