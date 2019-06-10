package com.zz.spring.proxy;

import com.zz.spring.service.impl.UserImpl;

public class UserLogImpl extends UserImpl {

    @Override
    public void query() {
        System.out.println("------log-------");
        super.query();
    }
}
