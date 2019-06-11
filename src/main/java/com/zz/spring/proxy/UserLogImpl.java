package com.zz.spring.proxy;

import com.zz.spring.service.impl.UserImpl;

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
