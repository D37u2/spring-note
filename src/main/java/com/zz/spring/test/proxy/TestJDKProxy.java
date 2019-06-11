package com.zz.spring.test.proxy;

import com.zz.spring.service.IUser;
import com.zz.spring.service.impl.UserImpl;
import com.zz.spring.test.bean.Test;
import com.zz.spring.test.proxy.handler.ProxyInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @author: zhoujiong
 * @description: TODO
 * @className: TestJDKProxy$
 * @date: 2019/6/11$ 16:25$
 */
public class TestJDKProxy {


    public static void main(String[] args) throws Throwable {

        Long time1 = System.currentTimeMillis();
        //获取代理对象
        IUser proxyUser = (IUser) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{IUser.class},new ProxyInvocationHandler(new UserImpl()));

        //执行方法
        proxyUser.query();

        System.out.println("JDK动态代理消耗时长："+(System.currentTimeMillis()-time1));

        /*Long time2 = System.currentTimeMillis();
        IUser iuser = new UserTimerImpl(new UserImpl());

        IUser proxy = (IUser) ProxyUtil2.createProxy(iuser,new ProxyInvocationHandler(iuser));

        proxy.query();

        System.out.println("手动模拟JDK动态代理消耗时长："+(System.currentTimeMillis()-time2));*/
    }

}
