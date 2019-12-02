package com.mj.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkInvocationHandel implements InvocationHandler {

    private Object target;

    public JdkInvocationHandel(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("办理手续。。");
        Object result = method.invoke(target, args);
        System.out.println("交付。。");
        return result;
    }


    /**
     * 获取代理对象接口
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

}
