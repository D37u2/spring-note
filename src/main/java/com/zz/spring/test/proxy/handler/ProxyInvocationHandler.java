package com.zz.spring.test.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: zhoujiong
 * @description: 自定义一个代理invoke
 * @className: ProxyInvocationHandler$
 * @date: 2019/6/11$ 16:45$
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * @author: zhoujiong
     * @description: TODO
     * @date: 2019/6/11 16:45
     * @param: [proxy 代理对象, method 目标方法, args 目标参数]
     * @return: java.lang.Object
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //逻辑处理
        System.out.println("ProxyInvocationHandler 逻辑处理");

        //invoke 参数(目标对象，目标参数)
        return method.invoke(target,args);

    }
}
