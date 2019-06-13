package com.zz.spring.service.impl;

import com.zz.spring.service.IUser;

public class UserImpl implements IUser {
    static {
        System.out.println("userImpl static");
    }

    @Override
    public void query() {
        System.out.println("UserImpl.query()");
    }

    @Override
    public String proxy(String p1) throws Throwable {
        System.out.println("UserImpl.query()");
        return "success";
    }
}
