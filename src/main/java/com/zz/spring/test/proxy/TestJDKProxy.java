package com.zz.spring.test.proxy;

import com.zz.spring.proxy.ProxyUtil2;
import com.zz.spring.proxy.UserTimerImpl;
import com.zz.spring.service.IUser;
import com.zz.spring.service.impl.UserImpl;
import com.zz.spring.test.proxy.handler.ProxyInvocationHandler;

/**
 * @author: zhoujiong
 * @description: TODO
 * @className: TestJDKProxy$
 * @date: 2019/6/11$ 16:25$
 */
public class TestJDKProxy {


    public static void main(String[] args) throws Throwable {

        //获取代理对象
        //IUser proxyUser = (IUser) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{IUser.class},new ProxyInvocationHandler(new UserImpl()));

        //执行方法
        //proxyUser.query();

        IUser iuser = new UserTimerImpl(new UserImpl());

        IUser proxy = (IUser) ProxyUtil2.createProxy(iuser,new ProxyInvocationHandler(iuser));

        proxy.query();
    }

}
