package com.mj;

import com.mj.cglib.CglibMethodInterceptor;
import com.mj.service.impl.ShopHouseImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * @program: 24_design_pattern
 * @description:
 * @author: 马 洁
 * @create: 2019-12-02 22:57
 **/
public class CglibClient {

    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        // 设置代理类的付类
        enhancer.setSuperclass(ShopHouseImpl.class);
        // 设置回调对象
        enhancer.setCallback(cglibMethodInterceptor);
        // 创建代理对象
        ShopHouseImpl shopHouseImpl = (ShopHouseImpl) enhancer.create();
        shopHouseImpl.shop();
    }

}
