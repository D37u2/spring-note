package com.zz.spring.proxy;

import com.zz.spring.service.IUser;

public class UserTimerImpl implements IUser {

    private IUser user;

    public UserTimerImpl(IUser user){
        this.user = user;
    }

    @Override
    public void query() {
        System.out.println("--------timer-------");
        user.query();
    }
}
