package com.mj.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: 24_design_pattern
 * @description:
 * @author: 马 洁
 * @create: 2019-12-02 22:52
 **/
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理后");
        return result;
    }
}
