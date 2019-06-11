package com.zz.spring.proxy;

/**
 * @author: zhoujiong
 * @description: 通过ProxyInvocationHandler自动生成的代理类
 * @className: $Proxy1$
 * @date: 2019/6/11$ 18:14$
 */
public class $Proxy1 implements com.zz.spring.service.IUser {
    private java.lang.reflect.InvocationHandler targetHandler;
    private com.zz.spring.service.IUser target;
    public $Proxy1(java.lang.reflect.InvocationHandler targetHandler,com.zz.spring.service.IUser target){
        this.target = target;
        this.targetHandler = targetHandler;
    }
    @Override
    public void query() throws Throwable {
        java.lang.reflect.Method method = target.getClass().getDeclaredMethod("query");
        Class[] argst = method.getParameterTypes();
        targetHandler.invoke(null,method,argst);
    }
    @Override
    public java.lang.String proxy(java.lang.String p1) throws Throwable {
        java.lang.reflect.Method method = target.getClass().getDeclaredMethod("proxy");
        Class[] argst = method.getParameterTypes();
        return (java.lang.String)targetHandler.invoke(null,method,argst);
    }

}
