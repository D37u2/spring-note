package com.zz.spring.proxy;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.zz.spring.service.IUser;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author: zhoujiong
 * @description: 使用JDK代理自动生成的代理类对象 
 * @className: User
 * @date: 2019/6/10 15:48
 */
public final class User extends Proxy implements IUser {
    private static Method m1;
    private static Method m3;
    private static Method m2;
    private static Method m4;
    private static Method m0;

    public User(InvocationHandler var1)   {
        super(var1);
    }

    @Override
    public final boolean equals(Object var1)   {
        try {
            return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final void query() throws Throwable {
        super.h.invoke(this, m3, (Object[])null);
    }

    @Override
    public final String toString()   {
        try {
            return (String)super.h.invoke(this, m2, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final String proxy(String var1) throws Throwable {
        return (String)super.h.invoke(this, m4, new Object[]{var1});
    }

    @Override
    public final int hashCode()   {
        try {
            return (Integer)super.h.invoke(this, m0, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m3 = Class.forName("com.zz.spring.service.IUser").getMethod("query");
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m4 = Class.forName("com.zz.spring.service.IUser").getMethod("proxy", Class.forName("java.lang.String"));
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}

