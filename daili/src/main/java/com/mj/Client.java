package com.mj;

import com.mj.jdk.JdkInvocationHandel;
import com.mj.service.ShopHouse;
import com.mj.service.impl.ShopHouseImpl;

public class Client {

    public static void main(String[] args) {
        //1  jdk
        JdkInvocationHandel jdkInvocationHandel=new JdkInvocationHandel(new ShopHouseImpl());
        ShopHouse proxy = jdkInvocationHandel.getProxy();
        proxy.shop();
    }
}
