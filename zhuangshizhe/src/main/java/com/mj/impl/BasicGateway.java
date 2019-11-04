package com.mj.impl;

import com.mj.GatewayCommonBehavior;

/**
 * @program: 24_design_pattern
 * @description: 被装饰的类
 * @author: 马 洁
 * @create: 2019-11-04 23:40
 **/
public class BasicGateway extends GatewayCommonBehavior {

    @Override
    public void service() {
        System.out.println("第1步，进入网关获取相关参数");
    }
}
