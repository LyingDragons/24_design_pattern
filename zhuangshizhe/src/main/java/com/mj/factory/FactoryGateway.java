package com.mj.factory;

import com.mj.GatewayCommonBehavior;
import com.mj.impl.BasicGateway;
import com.mj.impl.LimitDecorate;
import com.mj.impl.LogDecorate;

/**
 * @program: 24_design_pattern
 * @description:
 * @author: 马 洁
 * @create: 2019-11-04 23:51
 **/
public class FactoryGateway {

    public static GatewayCommonBehavior gatewayCommonBehavior(){
        return new LimitDecorate(new LogDecorate(new BasicGateway()));
    }

    public static void main(String[] args) {
        GatewayCommonBehavior gatewayCommonBehavior = FactoryGateway.gatewayCommonBehavior();
        gatewayCommonBehavior.service();
    }
}
